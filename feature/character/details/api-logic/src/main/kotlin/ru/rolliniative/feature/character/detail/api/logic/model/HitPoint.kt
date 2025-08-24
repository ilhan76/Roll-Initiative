package ru.rolliniative.feature.character.detail.api.logic.model

import ru.rollinitiative.core.model.domain.Dice
import ru.rollinitiative.core.model.domain.roll

data class HitPoint(
    val dice: Dice,
    val diceCount: Int,
    val additionalHP: Int
) {

    fun calculate(): Int = mutableListOf<Int>()
        .apply { repeat(diceCount) { add(dice.roll()) } }
        .sumOf { it }
        .and(additionalHP)
}
