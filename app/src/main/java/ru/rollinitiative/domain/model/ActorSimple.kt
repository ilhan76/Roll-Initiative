package ru.rollinitiative.domain.model

import ru.rollinitiative.domain.model.character.CreatureType

data class ActorSimple(
    val id: Int,
    val name: String,
    val type: CreatureType,
)