package ru.rollinitiative.convention.ktx

import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

internal fun DependencyHandlerScope.implementation(
    dependency: Provider<MinimalExternalModuleDependency>,
) {
    add("implementation", dependency)
}

internal fun DependencyHandlerScope.projectImplementation(
    dependency: String,
) {
    add("implementation", project(dependency))
}