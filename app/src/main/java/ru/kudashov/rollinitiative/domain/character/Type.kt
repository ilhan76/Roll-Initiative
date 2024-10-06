package ru.kudashov.rollinitiative.domain.character

sealed class Type {
    data object Undead: Type()
    data object Humanoid: Type()
    data object Dragon: Type()
    data object Construct: Type()
    data object Monster: Type()
    data object Animal: Type()
}