package ru.rolliniative.feature.character.list.api.logic.model

class Event(
    override val id: Long,
    override val name: String,
    override val initiative: Int,
    val description: String,
) : Actor()