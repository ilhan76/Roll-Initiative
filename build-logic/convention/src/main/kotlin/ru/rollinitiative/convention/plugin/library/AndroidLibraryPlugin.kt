package ru.rollinitiative.convention.plugin.library

import com.android.build.gradle.LibraryExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import ru.rollinitiative.convention.ktx.configureKotlinAndroid
import ru.rollinitiative.convention.ktx.libs

internal class AndroidLibraryPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugins.kotlin.android.get().pluginId)
                apply(libs.plugins.android.library.get().pluginId)
            }

            val libraryExtension = project.extensions.getByType<LibraryExtension>()

            configureKotlinAndroid(libraryExtension)
        }
    }
}