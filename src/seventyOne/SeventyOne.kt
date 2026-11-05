package seventyOne

import io.kotest.matchers.shouldBe
import java.util.Stack

fun simplifyPath(path: String): String {
    val stack = Stack<String>()

    for (sub in path.split("/")) {
        if (sub == "..") {
            if (stack.isNotEmpty()) stack.pop()
        } else if (sub == "" || sub == ".") {
            continue
        } else {
            stack.push(sub)
        }
    }

    val sb = StringBuilder()

    while (stack.isNotEmpty()) {
        sb.insert(0, "/" + stack.pop())
    }

    return if (sb.isNotEmpty()) sb.toString() else "/"
}

fun test() {
    simplifyPath("./home/user/../etc") shouldBe "/home/etc"
    simplifyPath("./../.") shouldBe "/"
}
