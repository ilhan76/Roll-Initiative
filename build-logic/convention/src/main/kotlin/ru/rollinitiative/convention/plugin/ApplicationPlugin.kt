package ru.rollinitiative.convention.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import ru.rollinitiative.convention.ktx.configureKotlinAndroid
import ru.rollinitiative.convention.ktx.libs

class ApplicationPlugin : Plugin<Project>{

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugins.android.application.get().pluginId)
                apply(libs.plugins.kotlin.android.get().pluginId)
            }

            val appExtension = project.extensions.getByType<AppExtension>()

            configureKotlinAndroid(appExtension)
        }
    }
}