package ru.kudashov.rollinitiative.screen.create_actor.data

import ru.kudashov.rollinitiative.R

enum class CreationMode(val textId: Int) {
    SIMPLE(R.string.create_actor_simple_mode_text),
    EXTENDED(R.string.create_actor_extended_mode_text), ;

    companion object {

        fun getByValue(id: Int): CreationMode {
            return entries.find { it.textId == id } ?: SIMPLE
        }
    }
}