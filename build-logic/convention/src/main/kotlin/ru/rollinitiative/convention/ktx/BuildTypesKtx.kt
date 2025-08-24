package ru.rollinitiative.convention.ktx

import com.android.build.gradle.BaseExtension
import org.gradle.api.Project

/**
 * Название билд тайпов в проекте
 */
internal enum class BuildType(val value: String) {
    DEBUG("debug"),
    RELEASE("release")
}

/**
 * Сконфигурировать билд тайпы. Нужно выполнять только для модуля app приложения
 */
internal fun Project.configureBuildTypes(
    commonExtension: BaseExtension,
) {
    with(commonExtension) {
        buildTypes {
            getByName(BuildType.DEBUG.value) {
                isDebuggable = true
                isMinifyEnabled = false
                applicationIdSuffix = ".dev"
            }

            getByName(BuildType.RELEASE.value) {
                isDebuggable = false
                isMinifyEnabled = true
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
        }
    }
}