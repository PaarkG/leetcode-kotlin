package eight

import io.kotest.matchers.shouldBe

fun myAtoi(s: String): Int {
    val trimmedString = s.trim()
    if (trimmedString.isEmpty()) return 0

    var digits = trimmedString

    val sign = trimmedString[0]
    var signFactor = 1
    if (sign == '-') {
        digits = trimmedString.substring(1)
        signFactor = -1
    } else if (sign == '+') {
        digits = trimmedString.substring(1)
    }

    var value = 0
    for (i in digits.indices) {
        val num = digits[i].code - 48
        if (num in 0 .. 9) {
            if (value * signFactor > Int.MAX_VALUE / 10) return Int.MAX_VALUE
            if (value * signFactor < Int.MIN_VALUE / 10) return Int.MIN_VALUE
            value *= 10
            if (value * signFactor > Int.MAX_VALUE - num) return Int.MAX_VALUE
            if (value * signFactor < Int.MIN_VALUE + num) return Int.MIN_VALUE

            value += num
        } else {
            break
        }
    }

    return value * signFactor
}

fun test() {
    myAtoi("-25") shouldBe -25
    myAtoi("0") shouldBe 0
    myAtoi("462523") shouldBe 462523
}
