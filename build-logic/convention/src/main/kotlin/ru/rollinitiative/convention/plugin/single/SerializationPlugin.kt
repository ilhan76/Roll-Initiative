package ru.rollinitiative.convention.plugin.single

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.rollinitiative.convention.ktx.implementation
import ru.rollinitiative.convention.ktx.libs

/**
 * Плагин для подключения Kotlin Serialization
 */
internal class SerializationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugins.kotlin.serialization.get().pluginId)
            }

            dependencies {
                implementation(libs.kotlinx.serialization.json)
            }
        }
    }
}