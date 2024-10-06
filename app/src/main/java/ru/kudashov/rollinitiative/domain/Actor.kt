package ru.kudashov.rollinitiative.domain

abstract class Actor {
    abstract val id: Int
    abstract val name: String
    abstract val initiative: Int
}