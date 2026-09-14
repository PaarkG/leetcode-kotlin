package oneThousandTwoHundredNinetyFive

import io.kotest.matchers.shouldBe

fun findNumbers(nums: IntArray): Int {
    var counter = 0

    for (num in nums) {
        if (num.toString().length % 2 == 0) {
            counter++
        }
    }

    return counter
}

fun test() {
    findNumbers(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) shouldBe 1
    findNumbers(intArrayOf(1, 23, 5934, 342, 3951, 2222, 9374)) shouldBe 5
    findNumbers(intArrayOf()) shouldBe 0
}
