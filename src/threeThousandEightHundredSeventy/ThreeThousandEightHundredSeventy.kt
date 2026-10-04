package threeThousandEightHundredSeventy

import io.kotest.matchers.shouldBe

fun countCommas(n: Int): Int {
    return maxOf(n - 999, 0)
}

fun test() {
    countCommas(1003) shouldBe 4
    countCommas(5) shouldBe 0
}
