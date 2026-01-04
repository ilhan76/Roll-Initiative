package ru.rollinitiative.convention.plugin.feature

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Плагин для подключения к модулям вида api-presentation
 */
class FeatureApiPresentationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("ru.rollinitiative.android.library.plugin")
                apply("ru.rollinitiative.navigation.plugin")
            }
        }
    }
}