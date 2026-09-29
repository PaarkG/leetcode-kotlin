package oneHundredNineteen

import io.kotest.matchers.collections.shouldBeSortedBy
import io.kotest.matchers.shouldBe

fun getRow(rowIndex: Int): List<Int> {
    val rows = mutableListOf<MutableList<Int>>()

    for (i in 0 .. rowIndex) {
        rows.add(MutableList<Int>(i + 1) { 1 })

        for (j in 1 ..< i) {
            rows[i][j] = rows[i - 1][j - 1] + rows[i - 1][j]
        }
    }

    return rows[rowIndex]
}

fun test() {
    getRow(4) shouldBe listOf(1, 4, 6, 4, 1)
    getRow(9) shouldBe listOf(1, 9, 36, 84, 126, 126, 84, 36, 9, 1)
}
