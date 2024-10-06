package ru.kudashov.rollinitiative.domain

import ru.kudashov.rollinitiative.domain.character.Condition

data class Combatant(
    override val id: Int,
    override val name: String,
    override val initiative: Int,
    val character: Any,
    val currentHp: Int,
    val tmpHp: Int,
    val conditions: List<Condition>
): Actor()