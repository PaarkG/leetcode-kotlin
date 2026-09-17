package threeHundredEightyNine

import io.kotest.matchers.shouldBe

fun findTheDifference(s: String, t: String): Char {
    val remaining = HashMap<Char, Int>()
    for (char in s) remaining[char] = (remaining[char] ?: 0) + 1

    for (char in t) {
        val remainingChar = remaining[char] ?: 0
        if (remainingChar <= 0) return char
        remaining[char] = remainingChar - 1
    }

    return '0'
}

fun test() {
    findTheDifference("abcde", "abccde") shouldBe 'c'
    findTheDifference("test string", "test  string") shouldBe ' '
    findTheDifference("second test string", "ssecond test string") shouldBe 's'
}
