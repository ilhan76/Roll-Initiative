package ru.kudashov.rollinitiative.domain.model

abstract class Actor {
    abstract val id: Long
    abstract val name: String
    abstract val initiative: Int
}