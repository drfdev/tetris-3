package dev.drf.tetris3.retail

interface GameChain {
    fun process(): Boolean
    fun abort(): Boolean
}