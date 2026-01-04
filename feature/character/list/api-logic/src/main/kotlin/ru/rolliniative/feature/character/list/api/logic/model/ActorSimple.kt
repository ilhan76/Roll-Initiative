package ru.rolliniative.feature.character.list.api.logic.model

import ru.rolliniative.feature.character.detail.api.logic.model.CreatureType

data class ActorSimple(
    val id: Int,
    val name: String,
    val type: CreatureType,
)