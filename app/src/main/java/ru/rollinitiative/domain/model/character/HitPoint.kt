package ru.rollinitiative.domain.model.character

import ru.rollinitiative.domain.model.Dice
import ru.rollinitiative.domain.model.roll

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
