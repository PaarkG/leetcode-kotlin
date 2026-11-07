package twoHundredNinety

import io.kotest.matchers.shouldBe

fun wordPattern(pattern: String, s: String): Boolean {
    val map = HashMap<Char, String>()

    val words = s.split(" ")
    if (pattern.length != words.size) return false

    for (i in words.indices) {
        val char = pattern[i]
        if (map.containsKey(char) || map.containsValue(words[i])) {
            if (map[char] != words[i]) return false
        } else {
            map[char] = words[i]
        }
    }

    return true
}

fun test() {
    wordPattern("aaabac", "one one one two one three") shouldBe true
    wordPattern("aaabac", "one one two one three two") shouldBe false
    wordPattern("dzxx", "dog cat mouse mouse") shouldBe true
}
