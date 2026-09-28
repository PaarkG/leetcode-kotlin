package oneThousandSixHundredFourteen

import io.kotest.matchers.shouldBe

fun maxDepth(s: String): Int {
    var max = 0
    var acc = 0
    for (c in s) {
        when (c) {
            '(' -> acc++
            ')' -> {
                max = maxOf(acc, max)
                acc--
            }
        }
    }
    return max
}

fun test() {
    maxDepth("test") shouldBe 0
    maxDepth("t(es)t") shouldBe 1
    maxDepth("(hel(llo) (wo(r))ld)") shouldBe 3
}
