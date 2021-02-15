package dev.drf.tetris3.retail

import dev.drf.tetris3.common.Score

fun getScope(rowCount: Int): Score {
    return Score.scoreByRow(rowCount)
}