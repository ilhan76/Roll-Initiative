plugins {
    id("ru.rollinitiative.application.plugin")
    id("ru.rollinitiative.application.compose.plugin")
}

android {
    namespace = "ru.rollinitiative"

    defaultConfig {
        applicationId = "ru.rollinitiative"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)

    implementation(project(":core:model:domain"))
    implementation(project(":core:model:data"))
    implementation(project(":core-ui:compose:uikit"))

    //feature
    implementation(project(":feature:main:impl-presentation"))
    implementation(project(":feature:character:details:impl-logic"))
    implementation(project(":feature:character:details:impl-presentation"))
    implementation(project(":feature:character:list:impl-logic"))
    implementation(project(":feature:character:list:impl-presentation"))
}
