package seven

import io.kotest.matchers.shouldBe

fun reverse(x: Int): Int {
    val str = x.toString()
    var negative = false
    var acc = 0
    for (i in str.length - 1 downTo 0) {
        if (str[i] == '-') negative = true
        else {
            val digit = str[i].code - 48
            if (acc > (Int.MAX_VALUE - digit) / 10) return 0
            acc = acc * 10 + digit
        }

    }

    return acc * if (negative) -1 else 1
}

fun test() {
    reverse(Int.MIN_VALUE) shouldBe 0
    reverse(123) shouldBe 321
    reverse(-432) shouldBe -234
}
