package dev.drf.tetris3.retail

import dev.drf.tetris3.common.Score
import dev.drf.tetris3.retail.game.TetrisGame

fun getScope(rowCount: Int): Score {
    return Score.scoreByRow(rowCount)
}

fun createGame(): Game {
    return TetrisGame();
}