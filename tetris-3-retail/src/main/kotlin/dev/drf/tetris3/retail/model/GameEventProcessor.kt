package dev.drf.tetris3.retail.model

interface GameEventProcessor<R> {
    fun handle(event: GameEvent<R>): R
}