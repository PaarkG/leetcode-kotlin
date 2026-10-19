package oneThousandFourHundredThirtyOne

import io.kotest.matchers.shouldBe

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val max = candies.fold(0, {a, b -> maxOf(a, b)})
    val bool = mutableListOf<Boolean>()

    for (i in 0 ..< candies.size) bool.add(candies[i] + extraCandies >= max)

    return bool
}

fun test() {
    kidsWithCandies(intArrayOf(1, 2, 3, 4), 4) shouldBe listOf(true, true, true, true)
    kidsWithCandies(intArrayOf(15, 2, 3), 8) shouldBe listOf(true, false, false)
    kidsWithCandies(intArrayOf(12, 2, 8, 5, 7), 6) shouldBe listOf(true, false, true, false, true)
}
