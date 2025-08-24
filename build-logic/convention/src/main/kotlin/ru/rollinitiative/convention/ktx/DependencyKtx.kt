package ru.rollinitiative.convention.ktx

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project
import org.gradle.kotlin.dsl.support.delegates.DependencyHandlerDelegate

internal fun DependencyHandlerScope.implementation(
    dependency: Provider<MinimalExternalModuleDependency>,
) {
    add("implementation", dependency)
}