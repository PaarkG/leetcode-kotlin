package twelve

import io.kotest.matchers.shouldBe
import kotlin.math.pow

fun intToRoman(num: Int): String {
    val charMap = HashMap<Int, Char>()
    charMap[1] = 'I'
    charMap[5] = 'V'
    charMap[10] = 'X'
    charMap[50] = 'L'
    charMap[100] = 'C'
    charMap[500] = 'D'
    charMap[1000] = 'M'

    var str = ""
    var remaining = num
    while (remaining > 0) {
        val factor = 10.0.pow(remaining.toString().length - 1).toInt()
        val digit = remaining / factor

        if (digit == 9 || digit == 4) {
            str += charMap[factor].toString() + charMap[(digit + 1) * factor].toString()
            remaining %= factor
        } else if (digit >= 5) {
            str += charMap[factor * 5].toString()
            remaining %= factor * 5
        } else {
            str += charMap[factor].toString().repeat(digit)
            remaining %= factor
        }
    }

    return str
}

fun test() {
    intToRoman(15) shouldBe "XV"
    intToRoman(490) shouldBe "CDXC"
    intToRoman(49) shouldBe "XLIX"
}
