package ru.rollinitiative.convention.plugin.single

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.rollinitiative.convention.ktx.implementation
import ru.rollinitiative.convention.ktx.libs

/**
 * Плагин для подключения Kotlin Coroutines
 */
internal class CoroutinesPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            dependencies {
                implementation(libs.kotlinx.coroutines.core)
            }
        }
    }
}