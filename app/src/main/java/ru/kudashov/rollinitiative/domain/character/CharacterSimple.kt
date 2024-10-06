package ru.kudashov.rollinitiative.domain.character

data class CharacterSimple(
    override val id: Int,
    override val name: String,
    override val size: Size,
    override val type: Type,
    override val armorClass: Int,
    override val comment: String,
    val maxHp: Int,
    val speed: Int,
) : Character() {

    override fun getHP() = maxHp
}