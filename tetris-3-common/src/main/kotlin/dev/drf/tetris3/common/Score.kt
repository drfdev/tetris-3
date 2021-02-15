package dev.drf.tetris3.common

enum class Score(val rowCount: Int, val score: Long) {
    SINGLE(1, 100L),
    DOUBLE(2, 300L),
    TRIPLE(3, 700L),
    TETRIS(4, 1500L);

    companion object {
        private val rowToScopeMap: Map<Int, Score> = values().associateBy({ it.rowCount }, { it })

        fun scoreByRow(rowCount: Int): Score {
            if (!rowToScopeMap.containsKey(rowCount)) {
                throw IllegalArgumentException("Unknown row counts: $rowCount")
            }
            return rowToScopeMap.get(rowCount)!!
        }
    }
}