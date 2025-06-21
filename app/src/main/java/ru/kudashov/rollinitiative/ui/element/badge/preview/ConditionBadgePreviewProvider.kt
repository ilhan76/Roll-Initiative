package ru.kudashov.rollinitiative.ui.element.badge.preview

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import ru.kudashov.rollinitiative.domain.model.character.Condition

/**
 * Провайдер данных для превью Badge
 */
class ConditionBadgePreviewParameterProvider : PreviewParameterProvider<Pair<Boolean, List<Condition>>> {
    override val values = sequenceOf(
        true to listOf(
            Condition.Unconscious,
            Condition.Frightened,
            Condition.Exhaustion,
            Condition.Invisible,
            Condition.Incapacitated,
            Condition.Deafened,
            Condition.Petrified,
            Condition.Restrained,
            Condition.Blinded,
            Condition.Poisoned,
            Condition.Charmed,
            Condition.Stunned,
            Condition.Paralyzed,
            Condition.Prone,
            Condition.Grappled,
            Condition.Insane,
            Condition.Concentrated,
            Condition.Surprised,
            Condition.Stabilized,
            Condition.Intoxicated,
            Condition.Dodging,
            Condition.PenaltyForHitting(-2),
            Condition.PenaltyForSavingThrow(-2),
        ),
        false to listOf(
            Condition.Unconscious,
            Condition.Frightened,
            Condition.Exhaustion,
            Condition.Invisible,
            Condition.Incapacitated,
            Condition.Deafened,
            Condition.Petrified,
            Condition.Restrained,
            Condition.Blinded,
            Condition.Poisoned,
            Condition.Charmed,
            Condition.Stunned,
            Condition.Paralyzed,
            Condition.Prone,
            Condition.Grappled,
            Condition.Insane,
            Condition.Concentrated,
            Condition.Surprised,
            Condition.Stabilized,
            Condition.Intoxicated,
            Condition.Dodging,
            Condition.PenaltyForHitting(-2),
            Condition.PenaltyForSavingThrow(-2),
        )
    )
}