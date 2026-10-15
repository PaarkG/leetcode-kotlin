package fiftyFive

import io.kotest.matchers.shouldBe

fun canJump(nums: IntArray): Boolean {
    val reachable = BooleanArray(nums.size) { false }
    reachable[0] = true
    for (i in nums.indices) {
        if (reachable[i]) {
            for (j in 0 .. nums[i]) {
                if (j + i < reachable.size) reachable[j + i] = true
            }
        }
    }

    return reachable[nums.size - 1]
}

fun test() {
    canJump(intArrayOf(1, 0, 1)) shouldBe false
    canJump(intArrayOf(5, 0, 0, 0, 0)) shouldBe true
    canJump(intArrayOf(1, 2, 0, 1, 3, 2)) shouldBe true
}
