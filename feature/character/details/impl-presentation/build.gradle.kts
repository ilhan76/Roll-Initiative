plugins {
    id("ru.rollinitiative.feature.impl.presentation.plugin")
}

android {
    namespace = "ru.rollinitiative.feature.character.detail.impl.presentation"
}

dependencies {
    implementation(project(":core:model:domain"))
    implementation(project(":feature:character:details:api-logic"))
    implementation(project(":feature:character:details:impl-logic"))
    implementation(project(":feature:character:details:api-presentation"))
}