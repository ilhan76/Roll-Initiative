package ru.kudashov.rollinitiative.screen.actors_list

import kotlinx.coroutines.flow.Flow
import ru.surfstudio.mvi.mappers.MapperFlowMiddleware

class ActorsListMiddleware: MapperFlowMiddleware<ActorsListEvent> {

    override fun transform(eventStream: Flow<ActorsListEvent>): Flow<ActorsListEvent> {
        return eventStream.transformations {
            addAll()
        }
    }
}