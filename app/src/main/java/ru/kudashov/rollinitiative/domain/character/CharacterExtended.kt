package ru.kudashov.rollinitiative.domain.character

import ru.kudashov.rollinitiative.domain.DamageType

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
    val characteristics: Characteristic,
    val saveThrowProficiency: List<Characteristic>,
    val skillProficiency: List<Skill>,
    val damageImmunity: List<DamageType>,
    val conditionImmunity: List<Condition>,
    val damageResistance: List<DamageType>,
    val proficiencyBonus: Int
) : Character() {
    override fun getHP(): Int = maxHP.calculate()
}