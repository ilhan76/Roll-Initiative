package ru.kudashov.rollinitiative.domain.model

import ru.kudashov.rollinitiative.domain.model.character.Character
import ru.kudashov.rollinitiative.domain.model.character.Condition

data class Combatant(
    override val id: Long,
    override val initiative: Int,
    val character: Character,
    val currentHp: Int,
    val tmpHp: Int,
    val conditions: List<Condition>
): Actor() {

    override val name: String get() = character.name
}