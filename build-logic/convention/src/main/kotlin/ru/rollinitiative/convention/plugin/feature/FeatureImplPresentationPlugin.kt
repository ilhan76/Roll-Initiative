package ru.rollinitiative.convention.plugin.feature

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Плагин для подключения к модулям вида impl-presentation
 */
class FeatureImplPresentationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("ru.rollinitiative.android.library.plugin")
                apply("ru.rollinitiative.compose.plugin")
//                apply("ru.rollinitiative.koin.plugin")
//                apply("ru.rollinitiative.navigation.plugin")
//                apply("ru.rollinitiative.coroutines.plugin")
            }
        }
    }
}