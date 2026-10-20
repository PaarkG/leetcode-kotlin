package oneHundredFiftyOne

import io.kotest.matchers.shouldBe

fun reverseWords(s: String): String {
    val sb1 = StringBuilder()
    val sb2 = StringBuilder()

    for (c in s) {
        if (c == ' ') {
            if (sb2.isNotEmpty()) {
                sb1.insert(0, "$sb2 ")
                sb2.clear()
            }
        } else sb2.append(c)
    }

    if (sb2.isNotEmpty()) sb1.insert(0, "$sb2 ")
    return sb1.toString().trim()
}

fun test() {
    reverseWords("the sky is blue") shouldBe "blue is sky the"
    reverseWords("a good   example") shouldBe "example good a"
}
