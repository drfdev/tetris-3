package dev.drf.tetris3.retail.model

/**
 * Trigger -> event
 * Step 1: GameEventListener.notify(event)
 * Step 2: add event in queue
 * Step 3: pop event from queue and handle by processors (GameEventProcessor.handle(event))
 * Step 4: build result (CallbackResult) and call NotificationCallBack.callback(result)
 */
interface GameEventListener {
    fun <R> notify(event: GameEvent<R>, callback: NotificationCallBack<R>)
    fun eventType(): GameEventType
}