package ru.kudashov.rollinitiative.screen.create_actor

import ru.kudashov.rollinitiative.screen.create_actor.data.ActorType
import ru.kudashov.rollinitiative.screen.create_actor.data.CreationMode
import ru.surfstudio.mvi.core.reducer.Reducer
import javax.inject.Inject

data class CreateActorState(
    val creationMode: CreationMode = CreationMode.SIMPLE,
    val actorType: ActorType = ActorType.Combatant
)

class CreateActorReducer @Inject constructor(): Reducer<CreateActorEvent, CreateActorState> {

    override fun reduce(state: CreateActorState, event: CreateActorEvent): CreateActorState {
        return when(event) {
            is CreateActorEvent.Input.OnModeChanged -> state.copy(creationMode = event.mode)
            else -> state
        }
    }
}