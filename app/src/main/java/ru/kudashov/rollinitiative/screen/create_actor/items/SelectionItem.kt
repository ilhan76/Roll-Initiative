package ru.kudashov.rollinitiative.screen.create_actor.items

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.domain.model.character.CreatureType
import ru.kudashov.rollinitiative.domain.model.character.getNameResource
import ru.kudashov.rollinitiative.screen.create_actor.data.UiItem
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun <T> SelectionItem(
    selectionItem: UiItem.SelectionItem<T>,
    modifier: Modifier = Modifier,
    onItemClick: (T) -> Unit = {},
) {
    ItemWithTitle(
        title = selectionItem.title,
        isObligatory = selectionItem.isObligatory,
        modifier = modifier,
        content = {
            FlowRow(
                modifier.fillMaxWidth()
            ) {
                selectionItem.selections.forEach { (value, isSelected) ->
                    FilterChip(
                        onClick = { onItemClick(value) },
                        label = {
                            Text(
                                text = value.toString(),
                                style = UiKitTheme.typography.caption2,
                                color = UiKitTheme.colors.textColorPrimary,
                            )
                        },
                        colors = FilterChipDefaults.filterChipColors().copy(
                            containerColor = UiKitTheme.colors.primary
                        ),
                        shape = RoundedCornerShape(15.dp),
                        border = null,
                        selected = isSelected,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun Preview() {
    UiKitTheme {
        SelectionItem(
            selectionItem = UiItem.SelectionItem(
                title = "Вид",
                isObligatory = true,
                multiSelection = false,
                selections = mapOf(*CreatureType.entries.map { stringResource(it.getNameResource()) to false }.toTypedArray())
            )
        )
    }
}

@Preview
@Composable
private fun PreviewDark() {
    UiKitTheme(darkTheme = true) {
        SelectionItem(
            selectionItem = UiItem.SelectionItem(
                title = "Вид",
                isObligatory = true,
                multiSelection = false,
                selections = mapOf(*CreatureType.entries.map { stringResource(it.getNameResource()) to false }.toTypedArray())
            )
        )
    }
}