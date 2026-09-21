package eleven

import io.kotest.matchers.shouldBe

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var max = 0

    while (left <= right) {
        max = maxOf(area(height, left, right), max)
        if (height[left] < height[right]) {
            left++
        } else right--
    }

    return max
}

fun area(height: IntArray, n: Int, m: Int): Int {
    val height = minOf(height[n], height[m]);
    return height * (m - n);
}

fun test() {
    maxArea(intArrayOf(1, 3, 5, 6, 7, 8, 9, 10)) shouldBe 25
    maxArea(intArrayOf(3, 1, 3)) shouldBe 6
    maxArea(intArrayOf(0)) shouldBe 0
}
