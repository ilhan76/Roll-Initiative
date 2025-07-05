package ru.kudashov.rollinitiative.ui.element.characteristics

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import ru.kudashov.rollinitiative.domain.model.character.Characteristics
import ru.kudashov.rollinitiative.ui.theme.UiKitTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import ru.kudashov.rollinitiative.R


@Composable
fun CharacteristicsSetup(
    modifier: Modifier = Modifier,
    characteristics: Characteristics,
    charSetupValue: String,
) {
    val bottomColor = UiKitTheme.colors.component1()
    val cornerShape = RoundedCornerShape(16.dp)

    val title = when(charSetupValue) {
        "strength" -> stringResource(id = R.string.strength)
        "dexterity" -> stringResource(id = R.string.dexterity)
        "constitution" -> stringResource(id = R.string.agility)
        "intelligence" -> stringResource(id = R.string.intelligence)
        "wisdom" -> stringResource(id = R.string.wisdom)
        "charisma" -> stringResource(id = R.string.charisma)
        else -> "Незвестная характеристика"
    }

    val initialValue = when (charSetupValue) {
        "strength" -> characteristics.strength
        "dexterity" -> characteristics.dexterity
        "constitution" -> characteristics.constitution
        "intelligence" -> characteristics.intelligence
        "wisdom" -> characteristics.wisdom
        "charisma" -> characteristics.charisma
        else -> 0
    }
    var currentValue by remember { mutableIntStateOf(initialValue) }

    fun incrementalValue(){
        currentValue++
    }

    fun decrementalValue(){
        if (currentValue > 0) {
            currentValue--
        }
    }

    Column(
        modifier = modifier
            .width(112.dp)
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Icon(
                imageVector = MinusLarge,
                contentDescription = "Уменьшить",
                tint = UiKitTheme.colors.secondary,
                modifier = Modifier
                    .size(48.dp)
                    .clickable{ incrementalValue() }
                    .padding(
                        horizontal = 8.dp,
                        vertical = 16.dp
                    )

            )

            Text(
                text = currentValue.toString(),
                color = UiKitTheme.colors.secondary,
                style = UiKitTheme.typography.caption2
            )

            Icon(
                imageVector = PlusLarge,
                contentDescription = "Увеличить",
                tint = UiKitTheme.colors.secondary,
                modifier = Modifier
                    .size(48.dp)
                    .clickable{ decrementalValue() }
                    .padding(
                        horizontal = 8.dp,
                        vertical = 16.dp
                    )

            )
        }
    }
}

@Preview
@Composable
fun CharacteristicsSetupPreview(){
    UiKitTheme(darkTheme = true){
        val characteristics = Characteristics(
            strength = 12,
            dexterity = 2,
            constitution = 3,
            intelligence = 4,
            wisdom = 5,
            charisma = 6
        )

        CharacteristicsSetup(
            modifier = Modifier,
            characteristics = characteristics,
            charSetupValue = "strength"
        )
    }
}