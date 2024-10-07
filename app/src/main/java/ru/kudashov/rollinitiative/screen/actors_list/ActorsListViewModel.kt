package ru.kudashov.rollinitiative.screen.actors_list

import ru.surfstudio.mvi.core.reducer.Reducer
import ru.surfstudio.mvi.flow.DslFlowMiddleware
import ru.surfstudio.mvi.flow.FlowState
import ru.surfstudio.mvi.vm.MviStatefulViewModel

class ActorsListViewModel: MviStatefulViewModel<ActorsListState, ActorsListEvent>() {

    override val middleware: DslFlowMiddleware<ActorsListEvent> = ActorsListMiddleware()
    override val reducer: Reducer<ActorsListEvent, ActorsListState> = ActorsListReducer()
    override val state: FlowState<ActorsListState> = FlowState(ActorsListState())

    init {
        bindFlow()
    }
}