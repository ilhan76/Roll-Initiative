package ru.kudashov.rollinitiative.screen.create_actor

import dagger.hilt.android.lifecycle.HiltViewModel
import ru.surfstudio.mvi.core.reducer.Reducer
import ru.surfstudio.mvi.flow.DslFlowMiddleware
import ru.surfstudio.mvi.flow.FlowState
import ru.surfstudio.mvi.vm.MviStatefulViewModel
import javax.inject.Inject

@HiltViewModel
class CreateActorViewModel @Inject constructor(
    override val middleware: CreateActorMiddleware,
    override val reducer: CreateActorReducer,
    override val state: FlowState<CreateActorState>,
): MviStatefulViewModel<CreateActorState, CreateActorEvent>() {

    init {
        bindFlow()
    }
}