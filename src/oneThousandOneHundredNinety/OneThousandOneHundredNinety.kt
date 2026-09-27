package oneThousandOneHundredNinety

import io.kotest.matchers.shouldBe
import java.util.Stack

fun reverseParentheses(s: String): String {
    val stack = Stack<StringBuilder>()
    var curr = StringBuilder()

    for (c in s) {
        when (c) {
            '(' -> {
                stack.push(curr)
                curr = StringBuilder()
            }
            ')' -> {
                curr = curr.reverse()
                curr = stack.pop().append(curr)
            }
            else -> curr.append(c)
        }
    }

    return curr.toString()
}

fun test() {
    reverseParentheses("hello") shouldBe "hello"
    reverseParentheses("hello (wor)ld") shouldBe "hello rowld"
    reverseParentheses("he(ll(o wor)ld)") shouldBe "hedlo worll"
}
