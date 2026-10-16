package seventeen

import io.kotest.matchers.shouldBe

fun letterCombinations(digits: String): List<String> {
    val map = HashMap<Int, Set<Char>>()
    map[2] = setOf('a', 'b', 'c')
    map[3] = setOf('d', 'e', 'f')
    map[4] = setOf('g', 'h', 'i')
    map[5] = setOf('j', 'k', 'l')
    map[6] = setOf('m', 'n', 'o')
    map[7] = setOf('p', 'q', 'r', 's')
    map[8] = setOf('t', 'u', 'v')
    map[9] = setOf('w', 'x', 'y', 'z')

    var list = mutableListOf<String>()

    for (digit in digits) {
        val num = (digit - '0')
        val set = map[num] ?: return emptyList()

        if (list.isEmpty()) {
            set.forEach { list.add(it.toString()) }
        } else {
            val newList = mutableListOf<String>()
            list.forEach { str ->
                for (c in set) {
                    newList.add(str + c)
                }
            }
            list = newList
        }
    }

    return list
}

fun test() {
    letterCombinations("23") shouldBe listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
    letterCombinations("9") shouldBe listOf("w", "x", "y", "z")
}
