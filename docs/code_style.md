# Code Style проекта Roll Initiative

## Содержание

- [1. Code Style](#1-code-style)
- [2. Compose](#2-compose)
  - [2.1. Особенности реализации `@Composable` в проекте](#21-особенности-реализации-composable-в-проекте)
  - [2.2. Drawable](#22-drawable)
  - [2.3. Strings](#23-strings)
  - [2.4. Dimens](#24-dimens)
  - [2.5. Colors, Fonts, Styles, Themes](#25-colors-fonts-styles-themes)
- [3. Названия классов в каждом слое](#3-названия-классов-в-каждом-слое)
  - [3.1. Use Case](#31-use-case)
  - [3.2. Repository](#32-repository)
  - [3.3. DataSource](#33-datasource)
  - [3.4. Models](#34-models)
- [4. Организация файлов и пакетов](#4-организация-файлов-и-пакетов)
  - [4.1. Правила именования модулей](#41-правила-именования-модулей)
  - [4.2. Правила именования пакетов](#42-правила-именования-пакетов)
  - [4.3. Extensions и Utils](#43-extensions-и-utils)
- [5. Комментарии (к чему и как писать)](#5-комментарии-к-чему-и-как-писать)

# 1. Code Style

Придерживаемся официального [kotlin code style](https://kotlinlang.org/docs/coding-conventions.html)

# 2. Compose

Основные правила написания кода с помощью Compose описаны в следующих статьях:
- [API Guidelines for Jetpack Compose](https://android.googlesource.com/platform/frameworks/support/+/androidx-main/compose/docs/compose-api-guidelines.md);
- [API Guidelines for  `@Composable`  components in Jetpack Compose](https://android.googlesource.com/platform/frameworks/support/+/androidx-main/compose/docs/compose-component-api-guidelines.md).

## 2.1. Особенности реализации `@Composable` в проекте

1. Параметры в `@Composable` располагаются в таком порядке:
   -- обязательные параметры, без которых `@Composable` использовать невозможно;
   -- `Modifier` - для возможности настройки поведения компонента извне;
   -- все остальные параметры (цвета, размерности, ресурсы, лямбды-обработчики, etc).
2. Для подавляющего большинства `@Composable`, рендерящих UI, обязательно добавление параметра `modifier: Modifier = Modifier`. Подробнее [здесь](https://android.googlesource.com/platform/frameworks/support/+/androidx-main/compose/docs/compose-api-guidelines.md#elements-accept-and-respect-a-modifier-parameter).

## 2.2. Drawable

XML не используется, переводим cvg в ImageVector

## 2.3. Strings

Название строкового ресурса должно отражать контекст использования.

`/res/values/strings.xml/{screen_name/element_name}_{resource_name}_{postfix}`.

Используемые постфиксы:

- `_title_text` - заголовочный текст для отображения на UI
- `_subtitle_text`,  `_description_text` - подзаголовочный текст для отображения на UI
- `_btn_text` - текста для кликабельных кнопок
- `_text`, `_message`, `_error` (в зависимости от контекста) - общие переиспользуемые текста
- `_fmt` - строки с регулярными выражениями

Например, `start_btn_text`.

## 2.4. Dimens

TODO работа с размерами в компоуз

## 2.5. Colors, Fonts, Styles, Themes

- Цвета и размеры текста берутся строго из темы, например `UiKitTheme.colors.primary` 

## 2.6 ImageVector

Для генерации ImageVector из SVG используем плагин Valkyrie.

Настройка:
- Output format должен быть Lazy delegate
- В настройках preview нужно включить чекбокс "Show ImageVector preview"

Требования к иконкам:

- Должны быть экстеншеном для UiKitIcon / UiKitImage
- Не должны содержать @Preview
- Должны использовать `by lazy`

Пример:

```Kotlin
val UiKitIcon.Add: ImageVector by lazy {
    ImageVector.Builder(
            // ...
        ).apply {
            // ...
        }.build()
    }
```

# 3. Названия классов в каждом слое

## 3.1. Use Case

- `I{Глагол в настоящем времени}{Существительное}UseCase` - интерфейс UseCase. Пример, `IGetCharacherByIdUseCase`.
- `{Глагол в настоящем времени}{Существительное}UseCase` - реализация UseCase, инкапсулирует переиспользуемую бизнес логику. Пример,
`GetCharacherByIdUseCase`.

## 3.2. Repository

- `I{FeatureName}Repository` - интерфейс репозитория. Пример, `ICharacterRepository`.
- `{FeatureName}Repository` - реализация репозитория, инкапсулирует работу с источниками данных. Пример,
  `CharacterRepository`.

## 3.3. Datasource

На этапе MVP не планируется использование сервера, но дабы следовать Clean Architecture и заложиться на расширяемость,
в приложении используются датасорсы. 

- `I{FeatureName}{Local/Remote}DataSource` - интерфейс источника данных
- `{FeatureName}{Local/Remote}DataSource` - источник данных. Пример, `CharacterLocalDataSource`

## 3.4. Models

[Модели данных](data_models.md)

# 4. Организация файлов и пакетов

## 4.1. Правила именования модулей

Модули именуются в нижнем регистре. Названия, состоящие из нескольких слов, объединяются через тире `-`. 
Например, `impl-presentation`, `api-logic`. При создании модуля, автоматически формируется название пакета 
с нижним подчеркиванием `_`. Необходимо заменить подчеркивание на точку `.`.

## 4.2. Правила именования пакетов

- Именуются в нижнем регистре
- Использование названий из нескольких слов не рекомендуется
- Если все-таки есть необходимость использовать несколько слов, можно объдинить их вместе через точку. Например, `ru.rollinitiative.ui.element.button.regular`
- Не используем множественное число в названиях

## 4.3. Extensions и Utils

- Файл именуется с постфиксом `Ktx` или `Utils`, при этом префикс должен соответствовать классу, который эти методы расширяет. Например, `LazyColumnKtx`, `DateUtils`
- Единственная ответсвенность (SRP из SOLID). Не стоит совмещать разноплановые функции в одном файле. Плохой пример `CommonUtils`, который содержит все подряд.

# 5. Комментарии (к чему и как писать)

К чему пишем комментарии:
- Предназначение всех классов, кроме самых очевидных.
- Методы, если их название не полностью объясняет выполняемые ими действия.
- Неочевидные участков кода.
- Для доменных моделей должны быть описаны все свойства.

Как пишем комментарии:
- На русском языке.
- Для методов и классов должны быть в формате [KDoc](https://kotlinlang.org/docs/kotlin-doc.html).
- Для классов и методов не должны раскрывать деталей реализации.
- Для класса пишем над самим классом. 
- К методам пишем над методом.