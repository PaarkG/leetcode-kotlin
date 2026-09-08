package fiftyEight

import io.kotest.matchers.shouldBe

fun lengthOfLastWord(s: String): Int {
    val words = s.split(" ")

    for (i in words.size - 1 downTo 0) {
        val size = words[i].length
        if (size != 0) return size
    }

    return -1
}

fun test() {
    lengthOfLastWord("Hello world") shouldBe 5
    lengthOfLastWord("test") shouldBe 4
    lengthOfLastWord("    ") shouldBe -1
}
