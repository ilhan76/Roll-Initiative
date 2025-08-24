plugins {
    id("ru.rollinitiative.feature.api.logic.plugin")
}

android {
    namespace = "ru.rollinitiative.feature.character.detail.api.logic"
}

dependencies {
    implementation(project(":core:model:domain"))
}