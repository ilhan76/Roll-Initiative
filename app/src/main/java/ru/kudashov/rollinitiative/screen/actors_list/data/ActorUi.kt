package ru.kudashov.rollinitiative.screen.actors_list.data

import ru.kudashov.rollinitiative.domain.character.CreatureType

data class ActorUi(
    val id: Int,
    val name: String,
    val type: CreatureType,
)