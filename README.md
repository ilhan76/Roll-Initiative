# Техническая документация приложения Roll Initiative

- [1. Функциональные требования](#1-функциональные-требования)
- [2. Процесс разработки](#2-процесс-разработки)
- [3. Code style](#3-code-style)
- [4. Архитектура](#4-архитектура)
    - [4.1. Структура многомодульности](#41-структура-многомодульности)
    - [4.2. UI слой](#42-ui-слой)
    - [4.3. Модели данных](#43-модели-данных)
- [5. Gradle convention plugins](#5-gradle-convention-plugins)
- [6. DI](#6-di)
- [7. Навигация](#7-навигация)
- [8. Coroutines](#8-coroutines)
- [9. Хранение данных](#9-хранение-данных)
- [10. UI](#10-ui)
- [11. Local Git Hooks](#11-local-git-hooks)
- 
## 1. Функциональные требования

**Основные характеристики**

- Язык программирования: Kotlin 2.+
- Минимальная версия ОС: Android 9 (minSdk 28)
- Поддерживаемые языки: русский, английский
- Структура: Многомодульное приложение
- Архитектура: Clean Architecture
- Presentation уровень: MVI (MVI Kotlin) + Single Activity
- Асинхронное взаимодействие: Coroutines + Flow
- Отрисовка UI: Compose

**Дополнительные библиотеки**

- Парсинг json: kotlinx.serialization
- База данных: SQLDelight
- DI: Koin
- Навигация: Decompose
- Анимации: Lottie
- Тестирование: kotlin.test

## 2. Процесс разработки

[Принятые на проекте процессы разработки](docs/development_processes.md)

## 3. Code style

[Правила код стайла](docs/code_style.md)

## 4. Архитектура

### 4.1. Структура многомодульности

[TODO](https://app.weeek.net/ws/44958/task/969354)

### 4.2. UI слой

[TODO](https://app.weeek.net/ws/44958/task/969364)

### 4.3. Модели данных

[Модели данных](docs/data_models.md)

## 5. Gradle convention plugins

[TODO](https://app.weeek.net/ws/44958/task/969356)

## 6. DI

[TODO](https://app.weeek.net/ws/44958/task/969368)

## 7. Навигация

[TODO](https://app.weeek.net/ws/44958/task/969367)

## 8. Coroutines

[Принятые на проекте практики использования coroutines](docs/coroutines.md)

## 9. Хранение данных

[Способы хранения данных](docs/data/datastore.md)

## 10. UI

Для создания UI в проекте используется compose.

Описание кодстайла и особенностей использования Compose в проекте описан [здесь](docs/code_style.md).

## 11. Local Git Hooks

[TODO](https://app.weeek.net/ws/44958/task/969352)