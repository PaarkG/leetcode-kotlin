package twoHundredTwo

import io.kotest.matchers.shouldBe

fun isHappy(n: Int): Boolean {
    val seen = HashSet<Int>()

    var num = n
    while (n != 1 && !seen.contains(num)) {
        seen.add(num)
        num = apply(num)
    }

    return num == 1
}

private fun apply(n: Int): Int {
    var sumSq = 0
    var rem = n
    while (rem > 0) {
        val dig = rem % 10
        sumSq += dig * dig
        rem /= 10
    }

    return sumSq
}

fun test() {
    isHappy(19) shouldBe true
    isHappy(20) shouldBe false
    isHappy(3) shouldBe false
}
