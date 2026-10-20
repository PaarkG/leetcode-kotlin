package threeHundredFortyFive

import io.kotest.matchers.shouldBe
import java.util.Stack

fun reverseVowels(s: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val stack = Stack<Char>()

    for (c in s) if (vowels.contains(c.lowercaseChar())) stack.push(c)

    val sb = StringBuilder()
    for (c in s) sb.append(if (vowels.contains(c.lowercaseChar())) stack.pop() else c)

    return sb.toString()
}

fun test() {
    reverseVowels("test") shouldBe "test"
    reverseVowels("hello") shouldBe "holle"
    reverseVowels("AeIOtew") shouldBe "eOIetAw"
}
