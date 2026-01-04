plugins {
    id("ru.rollinitiative.feature.impl.logic.plugin")
}

android {
    namespace = "ru.rollinitiative.feature.character.list.impl.logic"
}

dependencies {
    implementation(project(":core:model:domain"))
    implementation(project(":feature:character:list:api-logic"))
    implementation(project(":feature:character:details:api-logic"))
}