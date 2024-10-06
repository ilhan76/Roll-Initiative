package ru.kudashov.rollinitiative.domain.character

import ru.kudashov.rollinitiative.domain.Dice
import ru.kudashov.rollinitiative.domain.roll

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
