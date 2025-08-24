package ru.rollinitiative.convention.plugin.library

import org.gradle.api.Plugin
import org.gradle.api.Project
import ru.rollinitiative.convention.ktx.configureKotlinJvm
import ru.rollinitiative.convention.ktx.libs

/**
 * Плагин для конфигурации модуля, который является java android library
 */
class JavaLibraryPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugins.java.library.get().pluginId)
                apply(libs.plugins.kotlin.jvm.get().pluginId)
            }

            configureKotlinJvm()
        }
    }
}