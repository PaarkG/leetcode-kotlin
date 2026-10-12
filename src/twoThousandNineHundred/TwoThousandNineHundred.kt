package twoThousandNineHundred

import io.kotest.matchers.shouldBe

fun getLongestSubsequence(words: Array<String>, groups: IntArray): List<String> {
    val list = mutableListOf<Pair<String, Int>>()
    list.add(Pair(words[0], groups[0]))

    for (i in 1 ..< groups.size) {
        if (list[list.size - 1].second != groups[i]) {
            list.add(Pair(words[i], groups[i]))
        }
    }

    return list.map { it.first }
}

fun test() {
    getLongestSubsequence(arrayOf("One", "Two", "Three"), intArrayOf(1, 0, 1)) shouldBe listOf("One", "Two", "Three")
    getLongestSubsequence(arrayOf("One", "Two", "Three"), intArrayOf(1, 1, 1)) shouldBe listOf("One")
    getLongestSubsequence(arrayOf("One", "Two", "Three"), intArrayOf(1, 0, 0)) shouldBe listOf("One", "Two")
}
