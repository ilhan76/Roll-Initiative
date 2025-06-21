package ru.kudashov.rollinitiative.domain.model.character

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector
import ru.kudashov.rollinitiative.R
import ru.kudashov.rollinitiative.ui.icons.*
import ru.kudashov.rollinitiative.ui.theme.UiKitIcons

/**
 * Базовый класс для всех состояний персонажа
 */
sealed class Condition(
    val icon: ImageVector,
    @StringRes val nameRes: Int
) {
    data object Unconscious : Condition(UiKitIcons.Unconscious, R.string.condition_unconscious)
    data object Frightened : Condition(UiKitIcons.Frightened, R.string.condition_frightened)
    data object Exhaustion : Condition(UiKitIcons.Exhaustion, R.string.condition_exhaustion)
    data object Invisible : Condition(UiKitIcons.Invisible, R.string.condition_invisible)
    data object Incapacitated :
        Condition(UiKitIcons.Incapacitated, R.string.condition_incapacitated)

    data object Deafened : Condition(UiKitIcons.Deafened, R.string.condition_deafened)
    data object Petrified : Condition(UiKitIcons.Petrified, R.string.condition_petrified)
    data object Restrained : Condition(UiKitIcons.Restrained, R.string.condition_restrained)
    data object Blinded : Condition(UiKitIcons.Blinded, R.string.condition_blinded)
    data object Poisoned : Condition(UiKitIcons.Poisoned, R.string.condition_poisoned)
    data object Charmed : Condition(UiKitIcons.Charmed, R.string.condition_charmed)
    data object Stunned : Condition(UiKitIcons.Stunned, R.string.condition_stunned)
    data object Paralyzed : Condition(UiKitIcons.Paralyzed, R.string.condition_paralyzed)
    data object Prone : Condition(UiKitIcons.Prone, R.string.condition_prone)
    data object Grappled : Condition(UiKitIcons.Grappled, R.string.condition_grappled)
    data object Insane : Condition(UiKitIcons.Insane, R.string.condition_insane)
    data object Concentrated : Condition(UiKitIcons.Concentrated, R.string.condition_concentrated)
    data object Surprised : Condition(UiKitIcons.Surprised, R.string.condition_surprised)
    data object Stabilized : Condition(UiKitIcons.Stabilized, R.string.condition_stabilized)
    data object Intoxicated : Condition(UiKitIcons.Intoxicated, R.string.condition_intoxicated)
    data object Dodging : Condition(UiKitIcons.Dodging, R.string.condition_dodging)
    data class PenaltyForSavingThrow(
        val value: Int
    ) : Condition(UiKitIcons.PenaltyForSavingThrow, R.string.condition_penalty_for_saving_throw)

    data class PenaltyForHitting(
        val value: Int
    ) : Condition(UiKitIcons.PenaltyForHitting, R.string.condition_penalty_for_hitting)
}