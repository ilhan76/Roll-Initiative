package ru.kudashov.rollinitiative.domain.character

import ru.kudashov.rollinitiative.R

sealed class CreatureType {
    data object Aberration : CreatureType()
    data object Beast : CreatureType()
    data object Celestial : CreatureType()
    data object Construct : CreatureType()
    data object Dragon : CreatureType()
    data object Elemental : CreatureType()
    data object Fairy : CreatureType()
    data object Fiend : CreatureType()
    data object Giant : CreatureType()
    data object Humanoid : CreatureType()
    data object Monster : CreatureType()
    data object Plants : CreatureType()
    data object Undead : CreatureType()
    data object Slime : CreatureType()
    data object PackOfTinyBeasts : CreatureType()
}

fun CreatureType.getNameResource(): Int = when (this) {
    is CreatureType.Aberration -> R.string.aberration
    is CreatureType.Beast -> R.string.beast
    is CreatureType.Celestial -> R.string.celestial
    is CreatureType.Construct -> R.string.construct
    is CreatureType.Dragon -> R.string.dragon
    is CreatureType.Elemental -> R.string.elemental
    is CreatureType.Fairy -> R.string.fairy
    is CreatureType.Fiend -> R.string.fiend
    is CreatureType.Giant -> R.string.giant
    is CreatureType.Humanoid -> R.string.humanoid
    is CreatureType.Monster -> R.string.monster
    is CreatureType.Plants -> R.string.plant
    is CreatureType.Undead -> R.string.undead
    is CreatureType.Slime -> R.string.slime
    is CreatureType.PackOfTinyBeasts -> R.string.pack_of_tiny_beasts
}