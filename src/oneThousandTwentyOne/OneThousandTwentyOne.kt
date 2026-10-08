package oneThousandTwentyOne

import io.kotest.matchers.shouldBe

fun removeOuterParentheses(s: String): String {
    val sb = StringBuilder()
    var depth = 0
    for (c in s) {
        if (c == ')') depth--
        if (depth > 0) sb.append(c)
        if (c == '(') depth++
    }

    return sb.toString()
}

fun test() {
    removeOuterParentheses("()") shouldBe ""
    removeOuterParentheses("()(())") shouldBe "()"
    removeOuterParentheses("((()))") shouldBe "(())"
}