package ru.kudashov.rollinitiative.domain.character

abstract class Character {
    abstract val id: Int
    abstract val name: String
    abstract val size: Size
    abstract val type: Type
    abstract val armorClass: Int
    abstract val comment: String?

    abstract fun getHP(): Int
}