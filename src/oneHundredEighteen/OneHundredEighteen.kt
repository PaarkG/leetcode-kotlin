package oneHundredEighteen

import io.kotest.matchers.shouldBe

fun generate(numRows: Int): List<List<Int>> {
    val rows = mutableListOf<List<Int>>()

    for (i in 0 until numRows) {
        val row = MutableList(i + 1) { 1 }

        for (j in 1 until i) {
            row[j] = rows[i - 1][j - 1] + rows[i - 1][j]
        }

        rows.add(row)
    }

    return rows
}

fun test() {
    val list1 = listOf(
        listOf(1),
        listOf(1, 1),
        listOf(1, 2, 1),
    )
    generate(3) shouldBe list1

    val list2 = listOf(
        listOf(1),
        listOf(1, 1),
        listOf(1, 2, 1),
        listOf(1, 3, 3, 1)
    )
    generate(4) shouldBe list2

    generate(0) shouldBe listOf()
}
