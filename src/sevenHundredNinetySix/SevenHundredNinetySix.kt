package sevenHundredNinetySix

import io.kotest.matchers.shouldBe

fun rotateString(s: String, goal: String): Boolean {
    for (i in s.indices) {
        val before = s.substring(0, i)
        val after = s.substring(i)
        if (after + before == goal) return true
    }
    return false
}

fun test() {
    rotateString("abcde", "deabc") shouldBe true
    rotateString("", "") shouldBe true
    rotateString("abc", "bac") shouldBe false
}
