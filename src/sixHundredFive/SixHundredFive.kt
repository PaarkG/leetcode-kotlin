package sixHundredFive

import io.kotest.matchers.shouldBe

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var placed = 0
    for (i in 0 ..< flowerbed.size) {
        var valid = flowerbed[i] == 0
        if (i > 0) valid = flowerbed[i - 1] == 0 && valid
        if (i < flowerbed.size - 1) valid = flowerbed[i + 1] == 0 && valid
        if (valid) {
            placed++
            flowerbed[i] = 1
        }
    }

    return placed >= n
}

fun test() {
    canPlaceFlowers(intArrayOf(0, 1, 0, 1, 0), 1) shouldBe false
    canPlaceFlowers(intArrayOf(0, 1, 0, 1, 1), 0) shouldBe true
    canPlaceFlowers(intArrayOf(0, 0, 0, 1, 1), 1) shouldBe true
    canPlaceFlowers(intArrayOf(0, 0, 0, 0, 0), 3) shouldBe true
}
