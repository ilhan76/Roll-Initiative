pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Roll Initiative"

include(":app")
include(":core:model:data")
include(":core:model:domain")
include(":core-ui:compose:uikit")
include(":feature:character:detail:api-logic")
include(":feature:character:list:api-logic")
include(":feature:main:impl-presentation")
