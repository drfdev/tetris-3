package dev.drf.tetris3.retail.model.task

import dev.drf.tetris3.retail.getTetrisGame
import dev.drf.tetris3.retail.model.Task

class TerminateTask: Task {
    override fun process() {
        getTetrisGame().stopGame()
    }
}