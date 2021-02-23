package dev.drf.tetris3.retail.model

interface GameEventProcessor<T: Task> {
    fun handle(event: GameEvent<T>): T
}