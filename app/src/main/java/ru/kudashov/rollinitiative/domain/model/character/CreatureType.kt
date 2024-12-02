package ru.kudashov.rollinitiative.domain.model.character

import ru.kudashov.rollinitiative.R

enum class CreatureType {
    Aberration,
    Beast,
    Celestial,
    Construct,
    Dragon,
    Elemental,
    Fairy,
    Fiend,
    Giant,
    Humanoid,
    Monster,
    Plants,
    Undead,
    Slime,
    PackOfTinyBeasts,
}

fun CreatureType.getNameResource(): Int = when (this) {
    CreatureType.Aberration -> R.string.aberration
    CreatureType.Beast -> R.string.beast
    CreatureType.Celestial -> R.string.celestial
    CreatureType.Construct -> R.string.construct
    CreatureType.Dragon -> R.string.dragon
    CreatureType.Elemental -> R.string.elemental
    CreatureType.Fairy -> R.string.fairy
    CreatureType.Fiend -> R.string.fiend
    CreatureType.Giant -> R.string.giant
    CreatureType.Humanoid -> R.string.humanoid
    CreatureType.Monster -> R.string.monster
    CreatureType.Plants -> R.string.plant
    CreatureType.Undead -> R.string.undead
    CreatureType.Slime -> R.string.slime
    CreatureType.PackOfTinyBeasts -> R.string.pack_of_tiny_beasts
}