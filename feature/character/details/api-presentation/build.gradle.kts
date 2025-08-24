plugins {
    id("ru.rollinitiative.feature.api.presentation.plugin")
}

android {
    namespace = "ru.rollinitiative.feature.character.detail.api.presentation"
}

dependencies {
    implementation(project(":core:model:domain"))
    implementation(project(":feature:character:details:api-logic"))
}