package ru.kudashov.rollinitiative.ktx

fun calculateBonus(value: Int): Int? {
    return if (value >= 10) (value - 10) / 2 else null
}
