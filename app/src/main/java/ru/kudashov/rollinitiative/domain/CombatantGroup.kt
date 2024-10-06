package ru.kudashov.rollinitiative.domain

data class CombatantGroup(
    override val id: Int,
    override val name: String,
    override val initiative: Int,
    val combatants: List<Combatant>
): Actor()