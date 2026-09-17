package sevenHundredSeventyOne

import io.kotest.matchers.shouldBe

fun numJewelsInStones(jewels: String, stones: String): Int {
    val jewelSet = HashSet<Char>()
    for (jewel in jewels) jewelSet.add(jewel)

    var acc = 0
    for (stone in stones) if (jewelSet.contains(stone)) acc++
    return acc
}

fun test() {
    numJewelsInStones("aAbB", "aaaabacd") shouldBe 6
    numJewelsInStones("aAbB", "cd") shouldBe 0
    numJewelsInStones("", "aaaabacd") shouldBe 0
    numJewelsInStones("aAbBcC", "aBcAcBaB") shouldBe 8
}
