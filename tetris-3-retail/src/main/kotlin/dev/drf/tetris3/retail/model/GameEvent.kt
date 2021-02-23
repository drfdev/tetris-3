package dev.drf.tetris3.retail.model

interface GameEvent<T: Task> {
    fun process(): T
    fun eventType(): GameEventType
}