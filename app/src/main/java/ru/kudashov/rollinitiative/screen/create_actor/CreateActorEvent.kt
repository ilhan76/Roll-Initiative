package ru.kudashov.rollinitiative.screen.create_actor

import ru.kudashov.rollinitiative.domain.model.Actor
import ru.kudashov.rollinitiative.screen.create_actor.data.CreationMode
import ru.surfstudio.mvi.core.event.Event

sealed class CreateActorEvent : Event {
    sealed class Input : CreateActorEvent() {
        data object OnBackClick: Input()
        data class OnModeChanged(val mode: CreationMode): Input()
    }

    data class ActorModified(val actor: Actor) : CreateActorEvent()
}