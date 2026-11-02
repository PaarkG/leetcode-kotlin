package twoHundredNinetyTwo

import io.kotest.matchers.shouldBe

fun canWinNim(n: Int): Boolean {
    return n % 4 != 0
}

fun test() {
    canWinNim(5) shouldBe true
    canWinNim(7) shouldBe true
    canWinNim(12) shouldBe false
}
