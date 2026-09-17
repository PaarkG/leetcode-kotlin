package threeHundredEightyThree

import io.kotest.matchers.shouldBe

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val remaining = HashMap<Char, Int>()
    for (char in magazine) {
        remaining[char] = (remaining[char] ?: 0) + 1
    }

    for (char in ransomNote) {
        val magChar = remaining[char] ?: 0
        if (magChar <= 0) return false
        remaining[char] = magChar - 1
    }

    return true
}

fun test() {
    canConstruct("hello", "this is an article from my magazine") shouldBe false
    canConstruct("hello", "this is an article from my blog") shouldBe true
    canConstruct("test-1", "tes-1") shouldBe false
    canConstruct("", "") shouldBe true
}
