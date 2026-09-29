package oneThousandTwentyFive

import io.kotest.matchers.shouldBe

fun divisorGame(n: Int): Boolean {
    return n % 2 == 0
}

fun test() {
    divisorGame(1) shouldBe false
    divisorGame(501) shouldBe false
    divisorGame(502) shouldBe true
}
