package oneThousandTwoHundredSeven

import io.kotest.matchers.shouldBe

fun uniqueOccurrences(arr: IntArray): Boolean {
    val map = HashMap<Int, Int>()

    for (num in arr) {
        map[num] = (map[num] ?: 0) + 1
    }

    val frequencies = HashSet<Int>()
    for (num in map.values) {
        if (frequencies.contains(num)) return false
        frequencies.add(num)
    }

    return true
}

fun test() {
    uniqueOccurrences(intArrayOf(1, 2, 3, 2, 1)) shouldBe false
    uniqueOccurrences(intArrayOf(1, 2, 3, 3, 2, 2)) shouldBe true
    uniqueOccurrences(intArrayOf(1)) shouldBe true
}
