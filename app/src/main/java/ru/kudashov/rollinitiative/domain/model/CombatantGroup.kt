package ru.kudashov.rollinitiative.domain.model

data class CombatantGroup(
    override val id: Long,
    override val name: String,
    override val initiative: Int,
    val combatants: List<Combatant>
): Actor()