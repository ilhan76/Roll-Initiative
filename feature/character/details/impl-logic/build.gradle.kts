plugins {
    id("ru.rollinitiative.feature.impl.logic.plugin")
}

android {
    namespace = "ru.rollinitiative.feature.character.details.impl.logic"
}

dependencies {
    implementation(project(":core:model:domain"))
    implementation(project(":feature:character:details:api-logic"))
}