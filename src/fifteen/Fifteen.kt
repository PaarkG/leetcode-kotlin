package fifteen

import io.kotest.matchers.shouldBe

fun threeSum(nums: IntArray): List<List<Int>> {
    nums.sort()
    val triplets = ArrayList<List<Int>>()

    for (i in nums.indices) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        val first = nums[i]
        var lo = i + 1
        var hi = nums.size - 1

        while (lo < hi) {
            val second = nums[lo]
            val third = nums[hi]
            val sum = first + second + third
            if (sum == 0) {
                triplets.add(listOf(first, second, third))
                lo++
                hi--

                while (lo < hi && nums[lo] == second) lo++
                while (lo < hi && nums[hi] == third) hi--
            } else if (sum > 0) hi--
            else lo++
        }
    }

    return triplets.toList()
}

fun test() {
    threeSum(intArrayOf(1, 2, 3)) shouldBe listOf()
    threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)) shouldBe listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
}
