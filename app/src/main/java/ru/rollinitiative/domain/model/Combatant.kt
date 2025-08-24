package ru.rollinitiative.domain.model

import ru.rollinitiative.domain.model.character.Character
import ru.rollinitiative.domain.model.character.Condition

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