package threeThousandFourHundredNinetyEight

import io.kotest.matchers.shouldBe

fun reverseDegree(s: String): Int {
    var sum = 0
    for (i in s.indices) {
        sum += (26 - (s[i] - 'a')) * (i + 1)
    }
    return sum
}

fun test() {
    reverseDegree("abc") shouldBe 148
    reverseDegree("zaza") shouldBe 160
    reverseDegree("z") shouldBe 1
}
