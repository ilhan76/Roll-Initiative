package ru.kudashov.rollinitiative.domain.model

import ru.kudashov.rollinitiative.domain.model.character.CreatureType

data class ActorSimple(
    val id: Int,
    val name: String,
    val type: CreatureType,
)