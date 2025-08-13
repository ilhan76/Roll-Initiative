package ru.kudashov.rollinitiative.screen.create_actor.data

import ru.kudashov.rollinitiative.domain.model.Dice
import ru.kudashov.rollinitiative.domain.model.character.Characteristics
import ru.kudashov.rollinitiative.domain.model.character.Speed

sealed class UiItem {

    data object Avatar : UiItem()

    data class SelectionItem<T>(
        val title: String,
        val isObligatory: Boolean,
        val selections: Map<T, Boolean>,
        val multiSelection: Boolean,
    ) : UiItem()

    data class NumberItem(
        val title: String,
        val number: Int
    ) : UiItem()

    data class DiceItem(
        val selectedDice: Dice
    ) : UiItem()

    data class SpeedItem(
        val speed: Speed
    ) : UiItem()

    data class CharacteristicsItem(
        val characteristics: Characteristics
    ) : UiItem()

    data class CommentItem(
        val comment: String
    ) : UiItem()
}