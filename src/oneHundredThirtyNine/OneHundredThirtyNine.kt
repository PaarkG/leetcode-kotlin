package oneHundredThirtyNine

import io.kotest.matchers.shouldBe

fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val dp = Array<Boolean>(s.length + 1) { it -> false }
    dp[0] = false

    for (i in 1 ..< dp.size) {
        for (word in wordDict) {
            if (!dp[i]) {
                val startIndex = i - word.length
                if (startIndex >= 0) {
                    val sub = s.substring(startIndex, i)
                    if (sub == word && (i - word.length <= 0 || dp[i - word.length])) dp[i] = true
                }
            }
        }
    }

    return dp[dp.size - 1]
}

fun test() {
    wordBreak("hello", listOf("hell", "test")) shouldBe false
    wordBreak("my life", listOf("my", "life")) shouldBe false
    wordBreak("hello, world", listOf("hell", "world", "o, ")) shouldBe true
}
