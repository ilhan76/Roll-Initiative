package ru.kudashov.rollinitiative.ui.element.characteristics

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
import androidx.compose.ui.tooling.preview.PreviewParameter
import ru.kudashov.rollinitiative.ktx.calculateBonus
import androidx.compose.ui.tooling.preview.PreviewParameterProvider

@Composable
fun CharacterStatCell(
    modifier: Modifier = Modifier,
    characteristics: Characteristics,
    characteristicType: CharacteristicType
) {
    val cornerShape = RoundedCornerShape(15.dp)
    val title = stringResource(id = characteristicType.labelRes)
    val value = characteristicType.getValue(characteristics)
    val bonus = calculateBonus(value)


        Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(cornerShape)
            .background(UiKitTheme.colors.component1())
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




class CharPreviewProvider : PreviewParameterProvider<Characteristics>{
    override val values = sequenceOf(
        Characteristics(
            strength = 12,
            dexterity = 8,
            constitution = 3,
            intelligence = 29,
            wisdom = 0,
            charisma = -5
        )
    )
}

@Preview
@Composable
fun CharacterStatCellPreview(
    @PreviewParameter(CharPreviewProvider::class) previewData: Characteristics

) {
    UiKitTheme(darkTheme = true) {
        val characteristics = previewData

        CharacterStatCell(
            modifier = Modifier,
            characteristics = characteristics,
            characteristicType = CharacteristicType.CONSTITUTION,
        )
    }
}