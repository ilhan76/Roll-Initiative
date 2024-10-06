package ru.kudashov.rollinitiative.domain

enum class Dice(val value: Int) {
    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20),
    D100(100),
}

fun Dice.roll(): Int = (1..value).random()