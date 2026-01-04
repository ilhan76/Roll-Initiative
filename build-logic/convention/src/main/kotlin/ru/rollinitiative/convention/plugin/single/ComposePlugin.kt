package ru.rollinitiative.convention.plugin.single

import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import ru.rollinitiative.convention.ktx.configureComposeCommon
import ru.rollinitiative.convention.ktx.implementation
import ru.rollinitiative.convention.ktx.libs

internal class ComposePlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugins.compose.compiler.get().pluginId)
            }

            dependencies {
                implementation(platform(libs.androidx.compose.bom))
                implementation(libs.androidx.compose.activity)
                implementation(libs.androidx.compose.lifecycle.viewmodel)
                implementation(libs.androidx.compose.ui.asProvider())
                implementation(libs.androidx.compose.ui.graphics)
                implementation(libs.androidx.compose.ui.tooling.preview)
                implementation(libs.androidx.compose.material3)
                implementation(libs.androidx.compose.ui.tooling.asProvider())
            }

            configureComposeCommon(extensions.getByType<ApplicationExtension>())
        }
    }
}