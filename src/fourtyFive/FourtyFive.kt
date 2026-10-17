package fourtyFive

import io.kotest.matchers.shouldBe

fun jump(nums: IntArray): Int {
    val table = IntArray(nums.size) { 1000 }
    table[0] = 0
    for (i in 0 ..< nums.size) {
        val num = nums[i]
        for (j in 1 .. num) {
            if (i + j < nums.size) {
                table[i + j] = minOf(table[i + j], table[i] + 1)
            }
        }
    }

    return table[nums.size - 1]
}

fun test() {
    jump(intArrayOf(1, 3, 2)) shouldBe 2
    jump(intArrayOf(1, 1, 1, 1)) shouldBe 3
    jump(intArrayOf(10, 3, 1)) shouldBe 1
}
