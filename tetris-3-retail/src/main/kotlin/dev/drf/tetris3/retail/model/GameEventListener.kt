package dev.drf.tetris3.retail.model

/**
 * Trigger -> event
 * Step 1: GameEventListener.notify(event)
 * Step 2: add event in queue
 * Step 3: pop event from queue and handle by processors (GameEventProcessor.handle(event))
 * Step 4: build result (CallbackResult) and call NotificationCallBack.callback(result)
 */
interface GameEventListener {
    fun <T: Task> notify(event: GameEvent<T>, callback: NotificationCallBack<T>)
    fun eventType(): GameEventType
}