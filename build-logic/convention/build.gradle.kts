import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "ru.rolliniiative.build-logic.convention"

private val projectJavaVersion: JavaVersion = JavaVersion.toVersion(libs.versions.javaVersion.get())

java {
    sourceCompatibility = projectJavaVersion
    targetCompatibility = projectJavaVersion
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(projectJavaVersion.toString()))
}

dependencies {
    implementation(libs.gradle.plugin.android)
    implementation(libs.gradle.plugin.composeCompiler)
    implementation(libs.gradle.plugin.kotlin)
    // Workaround for version catalog working inside precompiled scripts
    // Issue - https://github.com/gradle/gradle/issues/15383
    implementation(files((libs as Any).javaClass.superclass.protectionDomain.codeSource.location))
}

gradlePlugin {
    plugins {
        // application
        register("ru.rollinitiative.application.plugin") {
            id = "ru.rollinitiative.application.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.application.ApplicationPlugin"
        }
        register("ru.rollinitiative.application.compose.plugin") {
            id = "ru.rollinitiative.application.compose.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.application.ApplicationComposePlugin"
        }

        // library
        register("ru.rollinitiative.android.library.plugin") {
            id = "ru.rollinitiative.android.library.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.library.AndroidLibraryPlugin"
        }

        // feature
        register("ru.rollinitiative.feature.api.logic.plugin") {
            id = "ru.rollinitiative.feature.api.logic.plugin"
            implementationClass =
                "ru.rollinitiative.convention.plugin.feature.FeatureApiLogicPlugin"
        }
        register("ru.rollinitiative.feature.api.presentation.plugin") {
            id = "ru.rollinitiative.feature.api.presentation.plugin"
            implementationClass =
                "ru.rollinitiative.convention.plugin.feature.FeatureApiPresentationPlugin"
        }
        register("ru.rollinitiative.feature.impl.logic.plugin") {
            id = "ru.rollinitiative.feature.impl.logic.plugin"
            implementationClass =
                "ru.rollinitiative.convention.plugin.feature.FeatureImplLogicPlugin"
        }
        register("ru.rollinitiative.feature.impl.presentation.plugin") {
            id = "ru.rollinitiative.feature.impl.presentation.plugin"
            implementationClass =
                "ru.rollinitiative.convention.plugin.feature.FeatureImplPresentationPlugin"
        }

        // single
        register("ru.rollinitiative.compose.plugin") {
            id = "ru.rollinitiative.compose.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.single.ComposePlugin"
        }
        register("ru.rollinitiative.serialization.plugin") {
            id = "ru.rollinitiative.serialization.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.single.SerializationPlugin"
        }
        register("ru.rollinitiative.coroutines.plugin") {
            id = "ru.rollinitiative.coroutines.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.single.CoroutinesPlugin"
        }
        register("ru.rollinitiative.koin.plugin") {
            id = "ru.rollinitiative.koin.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.single.KoinPlugin"
        }
        register("ru.rollinitiative.navigation.plugin") {
            id = "ru.rollinitiative.navigation.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.single.NavigationPlugin"
        }
    }
}
