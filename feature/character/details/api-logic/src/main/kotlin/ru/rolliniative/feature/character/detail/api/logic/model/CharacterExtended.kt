package ru.rolliniative.feature.character.detail.api.logic.model

import ru.rollinitiative.core.model.domain.Condition
import ru.rollinitiative.core.model.domain.DamageType

data class CharacterExtended(
    override val id: Int,
    override val name: String,
    override val size: Size,
    override val type: CreatureType,
    override val armorClass: Int,
    override val comment: String?,
    val race: Race,
    val maxHP: HitPoint,
    val speed: Speed,
    val characteristics: Characteristics,
    val saveThrowProficiency: List<Characteristic>,
    val skillProficiency: List<Skill>,
    val damageImmunity: List<DamageType>,
    val conditionImmunity: List<Condition>,
    val damageResistance: List<DamageType>,
    val proficiencyBonus: Int
) : Character() {
    override fun getHP(): Int = maxHP.calculate()
}