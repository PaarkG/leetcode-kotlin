package oneThousandSixHundredSixtyEight

import io.kotest.matchers.shouldBe

fun maxRepeating(sequence: String, word: String): Int {
    var k = 0
    while (sequence.contains(word.repeat(k + 1))) k++
    return k
}

fun test() {
    maxRepeating("hello", "l") shouldBe 2
    maxRepeating("test", "hello") shouldBe 0
    maxRepeating("helllohelllot", "helllo") shouldBe 2
    maxRepeating("ababc", "ab") shouldBe 2
    maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba") shouldBe 5
}
