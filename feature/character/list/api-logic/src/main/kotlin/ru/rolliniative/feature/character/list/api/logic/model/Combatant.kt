package ru.rolliniative.feature.character.list.api.logic.model

import ru.rollinitiative.core.model.domain.Condition
import ru.rolliniative.feature.character.detail.api.logic.model.Character

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