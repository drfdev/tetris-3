package dev.drf.tetris3.retail.model

data class CallbackResult<T: Task>(
    val type: GameEventType,
    val results: List<T>
)