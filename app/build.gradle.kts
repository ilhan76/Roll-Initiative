plugins {
    id("ru.rollinitiative.application.plugin")
    id("ru.rollinitiative.application.compose.plugin")
    id("ru.rollinitiative.compose.plugin")
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
}
