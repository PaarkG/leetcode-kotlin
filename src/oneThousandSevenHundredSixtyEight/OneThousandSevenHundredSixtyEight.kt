package oneThousandSevenHundredSixtyEight

import io.kotest.matchers.shouldBe

fun mergeAlternately(word1: String, word2: String): String {
    val sb = StringBuilder()

    for (i in 0 .. maxOf(word1.length, word2.length)) {
        if (i < word1.length) sb.append(word1[i])
        if (i < word2.length) sb.append(word2[i])
    }

    return sb.toString()
}

fun test() {
    mergeAlternately("hello", "world") shouldBe "hweolrllod"
    mergeAlternately("test", "a") shouldBe "taest"
    mergeAlternately("he said", "green") shouldBe "hger eseanid"
}
