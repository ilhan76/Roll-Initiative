package ru.rollinitiative.convention.ktx

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

internal fun Project.configureComposeCommon(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        buildFeatures {
            compose = true
        }
    }
}