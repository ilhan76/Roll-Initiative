package ru.rollinitiative.convention.ktx

import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.kotlin.dsl.the

/**
 * Доступ к version каталог
 */
internal val Project.libs: LibrariesForLibs
    get() = rootProject.the<LibrariesForLibs>()

/**
 * Версия java для проекта
 */
internal val Project.projectJavaVersion: JavaVersion
    get() = JavaVersion.toVersion(libs.versions.javaVersion.get().toInt())