package ru.rolliniative.feature.character.list.api.logic.model

abstract class Actor {
    abstract val id: Long
    abstract val name: String
    abstract val initiative: Int
}