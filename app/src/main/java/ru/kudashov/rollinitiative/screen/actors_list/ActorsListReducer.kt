package ru.kudashov.rollinitiative.screen.actors_list

import ru.surfstudio.mvi.core.reducer.Reducer

class ActorsListReducer : Reducer<ActorsListEvent, ActorsListState> {

    override fun reduce(state: ActorsListState, event: ActorsListEvent): ActorsListState {
        return when(event) {
            is ActorsListEvent.OnSearchQueryChanged -> state.copy(searchQuery = event.query)
            else -> state
        }
    }
}