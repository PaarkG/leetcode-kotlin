package threeHundredThirtyEight

import io.kotest.matchers.shouldBe

fun countBits(n: Int): IntArray {
    val arr = IntArray(n + 1)
    arr[0] = 0

    var offset = 1
    for (i in 1 .. n) {
        if (offset * 2 == i) offset = i
        arr[i] = arr[i - offset] + 1
    }

    return arr
}

fun test() {
    countBits(1) shouldBe intArrayOf(0, 1)
    countBits(3) shouldBe intArrayOf(0, 1, 1, 2)
}
