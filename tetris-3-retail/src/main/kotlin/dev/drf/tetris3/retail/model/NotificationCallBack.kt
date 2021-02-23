package dev.drf.tetris3.retail.model

interface NotificationCallBack<T: Task> {
    fun callback(result: CallbackResult<T>)
}