package dev.drf.tetris3.retail.model

data class CallbackResult<R>(
    val type: GameEventType,
    val results: List<R>
)