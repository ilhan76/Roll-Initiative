package ru.kudashov.rollinitiative.screen.create_actor

import kotlinx.coroutines.flow.Flow
import ru.surfstudio.mvi.flow.DslFlowMiddleware
import ru.surfstudio.mvi.flow.FlowState
import javax.inject.Inject

class CreateActorMiddleware @Inject constructor(
    private val flowState: FlowState<CreateActorState>,
) : DslFlowMiddleware<CreateActorEvent> {

    override fun transform(eventStream: Flow<CreateActorEvent>): Flow<CreateActorEvent> {
        return eventStream.transformations {
            addAll(

            )
        }
    }
}