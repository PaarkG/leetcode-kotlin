package threeSum

import io.kotest.matchers.shouldBe

fun threeSum(a: IntArray, target: Int): Int {
    var possible = 0
    a.sort()
    for (i in a.indices) {
        var lo = i + 1
        var hi = a.size - 1

        while (lo < hi) {
            val sum = a[i] + a[lo] + a[hi]
            if (sum == target) {
                possible++
                lo++
            } else if (sum > target) {
                hi--
            } else {
                lo++
            }
        }
    }
    return possible
}

fun test() {
    threeSum(intArrayOf(1, 2, 3), 6) shouldBe 1
    threeSum(intArrayOf(1, 2, 3, 4, 5, 6), 6) shouldBe 1
    threeSum(intArrayOf(12, 3, 4, 1, 6, 9), 24) shouldBe 1
    threeSum(intArrayOf(1, 2, 3, 5, 6, 11, 15, 16, 17, 18), 14) shouldBe 2
}
