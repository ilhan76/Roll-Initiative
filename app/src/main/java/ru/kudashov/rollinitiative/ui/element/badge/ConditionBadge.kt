package ru.kudashov.rollinitiative.ui.element.badge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.domain.model.character.Condition
import ru.kudashov.rollinitiative.ui.element.badge.preview.ConditionBadgePreviewParameterProvider
import ru.kudashov.rollinitiative.ui.element.button.icon.IconButton
import ru.kudashov.rollinitiative.ui.element.button.icon.IconButtonAppearances
import ru.kudashov.rollinitiative.ui.element.button.icon.IconButtonSizes
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

/**
 * Значок с условием состояния персонажа
 */
@Composable
fun ConditionBadge(
    modifier: Modifier = Modifier,
    condition: Condition,
    appearance: ConditionBadgeAppearance = ConditionBadgeAppearances.Default,
    size: ConditionBadgeSize = ConditionBadgeSizes.Medium,
    onClick: () -> Unit = {},
    onCloseClick: () -> Unit = {},
) {
    Row(
        modifier = modifier
            .height(size.height())
            .background(
                color = appearance.backgroundColor(),
                shape = appearance.backgroundShape(size)
            )
            .clickable { onClick() }
            .padding(horizontal = size.horizontalPadding()),
        horizontalArrangement = Arrangement.spacedBy(size.spaceBetweenIconAndText()),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier.size(size.iconSize()),
            imageVector = condition.icon,
            contentDescription = null,
            colorFilter = ColorFilter.tint(appearance.iconTint())
        )

        Text(
            text = stringResource(condition.nameRes),
            style = UiKitTheme.typography.caption1,
            color = appearance.textColor()
        )

        IconButton(
            appearance = IconButtonAppearances.Cross,
            size = IconButtonSizes.Tiny,
            onClick = onCloseClick
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Composable
private fun BadgePreview(
    @PreviewParameter(ConditionBadgePreviewParameterProvider::class) previewInfo: Pair<Boolean, List<Condition>>
) {
    UiKitTheme(darkTheme = previewInfo.first) {
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(7.dp)
        ) {
            previewInfo.second.forEach {
                ConditionBadge(condition = it)
            }
        }
    }
}
