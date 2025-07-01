package ru.kudashov.rollinitiative.ui.element.characteristics

import ru.kudashov.rollinitiative.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme
import ru.kudashov.rollinitiative.domain.model.character.Characteristics
import androidx.compose.ui.res.stringResource

@Composable
fun CharacterStatCell(
    modifier: Modifier = Modifier,
    characteristics: Characteristics,
    characteristicsValue: String,
) {
    val bottomColor = UiKitTheme.colors.component1()
    val cornerShape = RoundedCornerShape(15.dp)

    val title = when(characteristicsValue) {
        "strength" -> stringResource(id = R.string.strength)
        "dexterity" -> stringResource(id = R.string.dexterity)
        "constitution" -> stringResource(id = R.string.agility)
        "intelligence" -> stringResource(id = R.string.intelligence)
        "wisdom" -> stringResource(id = R.string.wisdom)
        "charisma" -> stringResource(id = R.string.charisma)
        else -> "Неизвестная характеристика"
    }

    val (value, bonus) = when (characteristicsValue) {
        "strength" -> characteristics.strength to calculateBonus(characteristics.strength)
        "dexterity" -> characteristics.dexterity to calculateBonus(characteristics.dexterity)
        "constitution" -> characteristics.constitution to calculateBonus(characteristics.constitution)
        "intelligence" -> characteristics.intelligence to calculateBonus(characteristics.intelligence)
        "wisdom" -> characteristics.wisdom to calculateBonus(characteristics.wisdom)
        "charisma" -> characteristics.charisma to calculateBonus(characteristics.charisma)
        else -> Pair(0, null)
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(cornerShape)
            .background(bottomColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(UiKitTheme.colors.component2())
                .padding(vertical = 4.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                color = UiKitTheme.colors.primary,
                style = UiKitTheme.typography.caption2
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            contentAlignment = Alignment.Center
        ) {
            val display = if (bonus != null) "$value (+$bonus)" else "$value"
            Text(
                text = display,
                color = UiKitTheme.colors.secondary,
                style = UiKitTheme.typography.subtitle2
            )
        }
    }
}

private fun calculateBonus(value: Int): Int? {
    return if (value >= 10) (value - 10) / 2 else null
}

@Preview
@Composable
fun CharacterStatCellPreview() {
    UiKitTheme(darkTheme = true) {
        val characteristics = Characteristics(
            strength = 12,
            dexterity = 8,
            constitution = 3,
            intelligence = 29,
            wisdom = 0,
            charisma = 899
        )

        CharacterStatCell(
            modifier = Modifier,
            characteristics = characteristics,
            characteristicsValue = "strength"
        )
    }
}