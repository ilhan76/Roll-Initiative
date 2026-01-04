package ru.rolliniative.feature.character.list.api.logic.model

data class CombatantGroup(
    override val id: Long,
    override val name: String,
    override val initiative: Int,
    val combatants: List<Combatant>
): Actor()