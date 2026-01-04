package ru.rollinitiative.convention.ktx

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import kotlin.collections.plus

/**
 * Сконфигурировать все настройки плагина Android и опции компилятора котлин
 */
internal fun Project.configureKotlinAndroid(
    commonExtension: BaseExtension,
) {
    commonExtension.apply {
        compileSdkVersion(libs.versions.compileSdk.get().toString().toInt())

        defaultConfig {
            minSdk = libs.versions.minSdk.get().toString().toInt()
            targetSdk = libs.versions.targetSdk.get().toString().toInt()
            versionCode = libs.versions.versionCode.get().toString().toInt()
            versionName = libs.versions.versionName.get().toString()
        }

        compileOptions {
            sourceCompatibility = projectJavaVersion
            targetCompatibility = projectJavaVersion
        }

        packagingOptions {
            resources {
                excludes += "/META-INF/{AL2.0,LGPL2.1}"
            }
        }
    }
    configureKotlinOptions()
}

internal fun Project.configureKotlinJvm() {
    extensions.configure<JavaPluginExtension> {
        sourceCompatibility = projectJavaVersion
        targetCompatibility = projectJavaVersion
    }

    configureKotlinOptions()
}

private fun Project.configureKotlinOptions() {
    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = projectJavaVersion.toString()
            freeCompilerArgs = freeCompilerArgs + listOf(
                "-opt-in=kotlin.RequiresOptIn",
                // Enable experimental coroutines APIs, including Flow
                "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
                "-opt-in=kotlinx.coroutines.FlowPreview",
                "-XXLanguage:+WhenGuards"
            )
        }
    }
}