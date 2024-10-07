package ru.kudashov.rollinitiative.screen.actors_list

import ru.surfstudio.mvi.core.event.Event

sealed class ActorsListEvent : Event {
    data object OnItemClick : ActorsListEvent()
    data object OnCreateActorClick : ActorsListEvent()

    data class OnSearchQueryChanged(val query: String) : ActorsListEvent()
}