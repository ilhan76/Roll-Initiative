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
include(":feature:character:details:api-logic")
include(":feature:character:details:api-presentation")
include(":feature:character:details:impl-logic")
include(":feature:character:details:impl-presentation")
include(":feature:character:list:api-logic")
include(":feature:character:list:api-presentation")
include(":feature:character:list:impl-logic")
include(":feature:character:list:impl-presentation")
include(":feature:main:impl-presentation")
