package sixtySix

import io.kotest.matchers.shouldBe

fun plusOne(digits: IntArray): IntArray {
    var carry = 0
    for (i in digits.size - 1 downTo 0) {
        val sum = carry + digits[i] + if (i == digits.size - 1) 1 else 0
        digits[i] = sum % 10
        carry = sum / 10
    }

    return if (carry > 0) intArrayOf(carry) + digits else digits
}

fun test() {
    plusOne(intArrayOf(9, 9)) shouldBe intArrayOf(1, 0, 0)
    plusOne(intArrayOf(2, 4)) shouldBe intArrayOf(2, 5)
    plusOne(intArrayOf(2, 1, 4, 7, 4, 8, 3, 6, 4, 7)) shouldBe intArrayOf(2, 1, 4, 7, 4, 8, 3, 6, 4, 8)
}