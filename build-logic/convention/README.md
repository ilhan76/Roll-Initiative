# Convention Плагины

## Оглавление

1. [Что такое Convention Плагины?](#что-такое-convention-плагины)
    - [Принцип работы](#принцип-работы)
2. [Композитная Сборка (Composite Build)](#композитная-сборка-composite-build)
    - [Что такое композитная сборка?](#что-такое-композитная-сборка)
    - [Как это работает?](#как-это-работает)
    - [Преимущества композитной сборки](#преимущества-композитной-сборки)
3. [Типы Convention Плагинов](#типы-convention-плагинов)
    - [1. Application Плагины](#1-application-плагины)
    - [2. Feature Плагины](#2-feature-плагины)
    - [3. Single Плагины](#3-single-плагины)
4. [Как Реализовать Convention Плагин](#как-реализовать-convention-плагин)
    - [Создание плагина](#создание-плагина)
    - [Регистрация плагина](#регистрация-плагина)
    - [Использование плагина](#использование-плагина)
    - [Когда писать плагин?](#когда-писать-плагин)
5. [Заключение](#заключение)

## Что такое Convention Плагины?

Convention плагины (плагины соглашений) - это специальные Gradle плагины, которые инкапсулируют
общую конфигурацию и настройки для проекта. Они позволяют:

- **Централизовать конфигурацию**: Вместо дублирования настроек в каждом модуле
- **Обеспечить консистентность**: Все модули используют одинаковые настройки
- **Упростить maintenance**: Изменения применяются в одном месте
- **Повысить читаемость**: `build.gradle.kts` файлы становятся более лаконичными

### Принцип работы

Convention плагины содержат предустановленные настройки для различных типов модулей. Например,
вместо написания 20 строк конфигурации в каждом модуле, достаточно применить один плагин:

```kotlin
// Вместо множества настроек
plugins {
    id("ru.rollinitiative.feature.impl.presentation.plugin")
}
```

## Композитная Сборка (Composite Build)

### Что такое композитная сборка?

Композитная сборка - это механизм Gradle, который позволяет включить один Gradle проект в качестве
зависимости другого проекта. В нашем случае, директория `build-logic` представляет собой отдельный
Gradle проект, который содержит convention плагины.

### Как это работает?

#### 1. Основной `settings.gradle.kts`

```kotlin
pluginManagement {
    includeBuild("build-logic") // Включаем композитную сборку
    //...
}
```

#### 2. `build-logic/settings.gradle.kts`

```kotlin
dependencyResolutionManagement {
    //...
}

rootProject.name = "build-logic"
include(":convention")
```

### Преимущества композитной сборки

- **Изоляция**: Плагины разрабатываются в отдельном проекте
- **Переиспользование**: Version catalog доступен в обеих сборках
- **Версионирование**: Плагины можно версионировать независимо
- **Тестирование**: Плагины можно тестировать отдельно

## Типы Convention Плагинов

В проекте реализованы три основных типа плагинов:

### 1. Application Плагины

Предназначены для главного приложения Android. Содержат настройки для APK/AAB генерации.

#### ApplicationPlugin

**Класс:** `ru.rollinitiative.convention.plugin.application.ApplicationPlugin`

Базовый плагин для Android приложения. Применяет:

- Android Application плагин
- Kotlin Android плагин
- Конфигурирует Kotlin и Android настройки
- Настраивает build types (Debug/Release)

#### ApplicationComposePlugin

**Класс:** `ru.rollinitiative.convention.plugin.application.ApplicationComposePlugin`

Специализированный плагин для Compose в Application модуле. Наследует базовые настройки от
`ApplicationPlugin` и добавляет Compose поддержку.

### 2. Feature Плагины

Используются для модулей, реализующих бизнес-логику приложения. Делятся на API и Implementation
части.

#### FeatureApiLogicPlugin

**Класс:** `ru.rollinitiative.convention.plugin.feature.FeatureApiLogicPlugin`

Плагин для подключения к модулям вида `api-logic`. Включает:

- Android Library настройки
- Kotlin Serialization
- Coroutines поддержку

#### FeatureApiPresentationPlugin

**Класс:** `ru.rollinitiative.convention.plugin.feature.FeatureApiPresentationPlugin`

Плагин для подключения к модулям вида `api-presentation`. Минимальный набор зависимостей для API
интерфейсов презентационного слоя.

#### FeatureImplLogicPlugin

**Класс:** `ru.rollinitiative.convention.plugin.feature.FeatureImplLogicPlugin`

Плагин для подключения к модулям вида `impl-logic`. Включает все необходимое для реализации
бизнес-логики.

#### FeatureImplPresentationPlugin

**Класс:** `ru.rollinitiative.convention.plugin.feature.FeatureImplPresentationPlugin`

Плагин для подключения к модулям вида `impl-presentation`. Включает:

- Android Library настройки
- Jetpack Compose поддержку
- Koin Dependency Injection
- Navigation Component
- Coroutines поддержку

#### Различия между API и Implementation

- **API модули** (`*-api-logic`, `*-api-presentation`):
    - Содержат интерфейсы и контракты
    - Минимальный набор зависимостей
    - Используются для разделения слоев архитектуры

- **Implementation модули** (`*-impl-logic`, `*-impl-presentation`):
    - Содержат конкретные реализации
    - Более богатый набор зависимостей (DI, UI, навигация)
    - Реализуют бизнес-логику и UI

### 3. Single Плагины

Отвечают за подключение конкретных технологий или библиотек. Используются как building blocks для
более сложных плагинов.

Примеры single плагинов в проекте:

- `ComposePlugin` - подключение Jetpack Compose
- `SerializationPlugin` - Kotlin Serialization
- `CoroutinesPlugin` - Kotlin Coroutines
- `KoinPlugin` - Dependency Injection
- `NavigationPlugin` - Navigation Component
- `AndroidLibraryPlugin` - базовые настройки Android библиотек

## Как Реализовать Convention Плагин

### Создание плагина

В методе `apply` реализовать тело плагина: подключить необходимые зависимости/другие плагины/настроить расширения gradle и тд

```kotlin
internal class ExamplePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            // 1. Применяем необходимые плагины
            with(pluginManager) {
                apply(libs.plugins.android.library.get().pluginId)
                apply(libs.plugins.kotlin.android.get().pluginId)
            }

            // 2. Конфигурируем расширения
            val libraryExtension = extensions.getByType<LibraryExtension>()
            configureKotlinAndroid(libraryExtension)

            // 3. Добавляем зависимости
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
            }
        }
    }
}
```

### Регистрация плагина

Плагин необходимо зарегистрировать в `build.gradle.kts` файле convention модуля:

```kotlin
gradlePlugin {
    plugins {
        register("ru.rollinitiative.example.plugin") {
            id = "ru.rollinitiative.example.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.ExamplePlugin"
        }
    }
}
```

### Использование плагина

```kotlin
// В модуле приложения
plugins {
    id("ru.rollinitiative.example.plugin")
}
```

### Когда писать плагин?

- Если какая-то часть логики конфигурации переиспользуется между несколькими модулями проекта
- Содержит не только подключение какой-то библиотеки, но и дополнительные плагины
- Плагин можно вынести в логичный и осмысленный функционал

## Заключение

Convention плагины позволяют:

- Стандартизировать конфигурацию проекта
- Упростить создание новых модулей
- Централизованно управлять зависимостями и настройками
- Повысить maintainability кода

Композитная сборка обеспечивает:

- Изоляцию плагинов от основного проекта
- Возможность версионирования плагинов
- Доступ к version catalog из плагинов
- Лучшую организацию кода