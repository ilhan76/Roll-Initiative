package ru.kudashov.rollinitiative.domain.character

data class Speed(
    val running: Int? = null,
    val flying: Int? = null,
    val swimming: Int? = null,
    val digging: Int? = null,
)