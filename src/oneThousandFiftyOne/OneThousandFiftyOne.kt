package oneThousandFiftyOne

import io.kotest.matchers.shouldBe

fun heightChecker(heights: IntArray): Int {
    val aux = IntArray(heights.size)
    for (i in heights.indices) {
        aux[i] = heights[i]
    }
    aux.sort()

    var counter = 0
    for (i in heights.indices) {
        if (heights[i] != aux[i]) counter++
    }

    return counter
}

fun test() {
    heightChecker(intArrayOf(2, 5, 3, 1)) shouldBe 3
    heightChecker(intArrayOf(1, 2, 3, 4)) shouldBe 0
    heightChecker(intArrayOf(1, 2, 3, 4, 9, 5)) shouldBe 2
}
