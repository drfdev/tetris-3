package dev.drf.tetris3.retail.model

interface GameEvent<R> {
    fun process(): R
    fun eventType(): GameEventType
}