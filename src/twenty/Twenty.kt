package twenty

import java.util.Stack;

fun isValid(s: String): Boolean {
    val charStack = Stack<Char>()
    val pairs = hashMapOf(Pair(')', '('), Pair(']', '['), Pair('}', '{'))

    for (char in s.toCharArray()) {
        if (char in pairs.values) {
            charStack.push(char)
        } else if (char in pairs) {
            if (charStack.isEmpty()) return false
            val pop = charStack.pop()
            if (pop != pairs[char]) return false
        }
    }

    return charStack.isEmpty()
}
