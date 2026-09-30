package oneThousandSixHundredSixtyEight

import io.kotest.matchers.shouldBe

fun maxRepeating(sequence: String, word: String): Int {
    var k = sequence.length / word.length
    while (!sequence.contains(word.repeat(k))) k--
    return k
}

fun test() {
    maxRepeating("hello", "l") shouldBe 2
    maxRepeating("test", "hello") shouldBe 0
    maxRepeating("helllohelllot", "helllo") shouldBe 2
    maxRepeating("ababc", "ab") shouldBe 2
    maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba") shouldBe 5
}
