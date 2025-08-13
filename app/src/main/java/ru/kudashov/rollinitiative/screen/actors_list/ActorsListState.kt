package ru.kudashov.rollinitiative.screen.actors_list

import ru.kudashov.rollinitiative.screen.actors_list.data.ActorUi

data class ActorsListState(
    val searchQuery: String = "",
    val actors: List<ActorUi> = emptyList(),
)