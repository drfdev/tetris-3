package dev.drf.tetris3.retail.model.event

import dev.drf.tetris3.retail.model.GameEvent
import dev.drf.tetris3.retail.model.GameEventType
import dev.drf.tetris3.retail.model.task.TerminateTask

class TerminateGameEvent: GameEvent<TerminateTask> {
    override fun process(): TerminateTask {
        return TerminateTask()
    }

    override fun eventType() = GameEventType.TERMINATION
}