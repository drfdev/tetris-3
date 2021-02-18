package dev.drf.tetris3.retail

interface GameChain {
    fun process(engine: GameEngine): Boolean
    fun abort(engine: GameEngine): Boolean
}