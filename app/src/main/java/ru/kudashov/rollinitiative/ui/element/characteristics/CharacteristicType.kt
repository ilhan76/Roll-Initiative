package ru.kudashov.rollinitiative.ui.element.characteristics

import ru.kudashov.rollinitiative.R
import ru.kudashov.rollinitiative.domain.model.character.Characteristics

enum class CharacteristicType(val labelRes: Int) {
    STRENGTH(R.string.characteristic_strength_title_text_short),
    DEXTERITY(R.string.characteristic_dexterity_title_text_short),
    CONSTITUTION(R.string.characteristic_constitution_title_text_short),
    INTELLIGENCE(R.string.characteristic_intelligence_title_text_short),
    WISDOM(R.string.characteristic_wisdom_title_text_short),
    CHARISMA(R.string.characteristic_charisma_title_text_short)

}

fun CharacteristicType.getValue(characteristics: Characteristics): Int{
    return when(this) {
        CharacteristicType.STRENGTH -> characteristics.strength
        CharacteristicType.DEXTERITY -> characteristics.dexterity
        CharacteristicType.CONSTITUTION -> characteristics.constitution
        CharacteristicType.INTELLIGENCE -> characteristics.intelligence
        CharacteristicType.WISDOM -> characteristics.wisdom
        CharacteristicType.CHARISMA -> characteristics.charisma
    }
}