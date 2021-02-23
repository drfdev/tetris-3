package dev.drf.tetris3.retail.model

interface NotificationCallBack<R> {
    fun callback(result: CallbackResult<R>)
}