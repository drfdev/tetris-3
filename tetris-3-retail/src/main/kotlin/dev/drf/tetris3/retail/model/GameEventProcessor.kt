package dev.drf.tetris3.retail.model

interface GameEventProcessor {
    fun <T: Task> handle(event: GameEvent<T>): T
}