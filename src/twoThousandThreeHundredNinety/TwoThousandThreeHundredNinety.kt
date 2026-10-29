package twoThousandThreeHundredNinety

import io.kotest.matchers.shouldBe
import java.util.Stack

fun removeStars(s: String): String {
    val chars = Stack<Char>()

    for (c in s) {
        if (c == '*') {
            if (chars.isNotEmpty()) {
                chars.pop()
            }
        } else {
            chars.push(c)
        }
    }

    val sb = StringBuilder()
    while (chars.isNotEmpty()) {
        sb.append(chars.pop())
    }

    return sb.reverse().toString()
}

fun test() {
    removeStars("abc*de*") shouldBe "abd"
    removeStars("abcde*******") shouldBe ""
    removeStars("hell* wo*ld *") shouldBe "hel wld"
}
