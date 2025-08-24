plugins {
    id("ru.rollinitiative.feature.api.presentation.plugin")
}

android {
    namespace = "ru.rollinitiative.feature.character.list.api.presentation"
}

dependencies {
    implementation(project(":core:model:domain"))
    implementation(project(":feature:character:list:api-logic"))
    implementation(project(":feature:character:details:api-logic"))
}