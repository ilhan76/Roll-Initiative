package ru.kudashov.rollinitiative.domain.character

sealed class Condition {
    data object Unconscious: Condition()
    data object Frightened: Condition()
    data object Exhausted: Condition()
    data object Invisible: Condition()
    data object Incapacitated: Condition()
    data object Deafened: Condition()
    data object Petrified: Condition()
    data object Restrained: Condition()
    data object Blinded: Condition()
    data object Poisoned: Condition()
    data object Charmed: Condition()
    data object Stunned: Condition()
    data object Paralysed: Condition()
    data object ConditionProne: Condition()
    data object Grappled: Condition()

    data object Dodging: Condition()
}