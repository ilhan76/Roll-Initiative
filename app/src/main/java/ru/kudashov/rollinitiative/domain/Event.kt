package ru.kudashov.rollinitiative.domain

class Event(
    override val id: Int,
    override val name: String,
    override val initiative: Int,
    val description: String,
) : Actor()