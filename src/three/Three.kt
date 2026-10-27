package three

import io.kotest.matchers.shouldBe

fun lengthOfLongestSubstring(s: String): Int {
    var max = 0
    var left = 0
    val seen = HashMap<Char, Int>()

    for (right in s.indices) {
        val c = s[right]
        val lastSeen = seen[c]

        if (lastSeen != null && lastSeen >= left) {
            left = lastSeen + 1
        }

        seen[c] = right
        max = maxOf(max, right - left + 1)
    }

    return max
}

fun test() {
    lengthOfLongestSubstring("hello") shouldBe 3
    lengthOfLongestSubstring("test string") shouldBe 7
    lengthOfLongestSubstring("abcc") shouldBe 3
    lengthOfLongestSubstring("ccbbcc") shouldBe 2
}
