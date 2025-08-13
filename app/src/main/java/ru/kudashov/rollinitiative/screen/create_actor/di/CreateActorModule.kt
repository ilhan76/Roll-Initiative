package ru.kudashov.rollinitiative.screen.create_actor.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.kudashov.rollinitiative.screen.create_actor.CreateActorState
import ru.surfstudio.mvi.flow.FlowState

@Module
@InstallIn(ViewModelComponent::class)
class CreateActorModule {

    @Provides
    fun provideState(): FlowState<CreateActorState> {
        return FlowState(CreateActorState())
    }
}