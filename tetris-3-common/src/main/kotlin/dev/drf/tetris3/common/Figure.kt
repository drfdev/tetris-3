package dev.drf.tetris3.common

interface Figure {
    fun type(): FigureType

    fun rotate()

    fun move(direction: Direction)
}