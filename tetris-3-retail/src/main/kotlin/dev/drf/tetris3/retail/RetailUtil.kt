package dev.drf.tetris3.retail

import dev.drf.tetris3.common.Score
import dev.drf.tetris3.retail.chain.StartupGameChain
import dev.drf.tetris3.retail.game.TetrisGame

object RetailUtil {
    val tetrisGame: TetrisGame by lazy {
        TetrisGame(StartupGameChain())
    }
}

fun getScope(rowCount: Int): Score {
    return Score.scoreByRow(rowCount)
}

fun getTetrisGame(): Game {
    return RetailUtil.tetrisGame
}