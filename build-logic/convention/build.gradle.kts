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
        register("ru.rollinitiative.application.plugin") {
            id = "ru.rollinitiative.application.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.ApplicationPlugin"
        }
        register("ru.rollinitiative.application.compose.plugin") {
            id = "ru.rollinitiative.application.compose.plugin"
            implementationClass = "ru.rollinitiative.convention.plugin.ApplicationComposePlugin"
        }
    }
}
