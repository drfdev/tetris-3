package dev.drf.tetris3.retail.game

import dev.drf.tetris3.retail.Game
import dev.drf.tetris3.retail.GameChain
import dev.drf.tetris3.retail.engine.TetrisGameEngine

class TetrisGame(private val chain: GameChain) : Game {
    private val engine = TetrisGameEngine()

    override fun runGame() {
        chain.process(engine)
    }

    override fun stopGame() {
        chain.abort(engine)
    }
}