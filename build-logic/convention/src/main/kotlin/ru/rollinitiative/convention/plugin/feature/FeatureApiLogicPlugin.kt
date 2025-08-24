package ru.rollinitiative.convention.plugin.feature

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Плагин для подключения к модулям вида api-logic
 */
class FeatureApiLogicPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("ru.rollinitiative.android.library.plugin")
//                apply("ru.rollinitiative.serialization.plugin")
//                apply("ru.rollinitiative.coroutines.plugin")
            }
        }
    }
}