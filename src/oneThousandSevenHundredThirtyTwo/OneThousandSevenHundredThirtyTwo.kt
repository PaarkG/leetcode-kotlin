package oneThousandSevenHundredThirtyTwo

import io.kotest.matchers.shouldBe

fun largestAltitude(gain: IntArray): Int {
    var max = 0
    var curr = 0

    for (g in gain) {
        curr += g
        max = maxOf(max, curr)
    }

    return max
}

fun test() {
    largestAltitude(intArrayOf(1, 2, 3, 2, 1)) shouldBe 9
    largestAltitude(intArrayOf(1, 7, -12, 3, 2)) shouldBe 8
    largestAltitude(intArrayOf(-5, 2, 1, -8, 6)) shouldBe 0
}
