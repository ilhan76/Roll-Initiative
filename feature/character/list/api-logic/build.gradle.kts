plugins {
    id("ru.rollinitiative.feature.api.logic.plugin")
}

android {
    namespace = "ru.rollinitiative.feature.character.list.api.logic"
}

dependencies {
    implementation(project(":core:model:domain"))
    implementation(project(":feature:character:detail:api-logic"))
}