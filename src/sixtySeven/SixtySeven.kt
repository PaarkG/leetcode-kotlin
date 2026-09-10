package sixtySeven

import io.kotest.matchers.shouldBe
import java.util.LinkedList

fun addBinary(a: String, b: String): String {
    var aI = a.length - 1
    var bI = b.length - 1
    var carry = 0
    var returnString = ""

    while (aI >= 0 || bI >= 0 || carry > 0) {
        val aVal = if (aI >= 0) a[aI].code - 48 else 0
        val bVal = if (bI >= 0) b[bI].code - 48 else 0
        val sum = aVal + bVal + carry

        carry = sum / 2
        val nextDigit = sum % 2

        returnString = "$nextDigit$returnString"

        aI--
        bI--
    }

    return returnString
}

fun test() {
    addBinary("101", "010") shouldBe "111"
    addBinary("1010", "1111") shouldBe "11001"
    addBinary("1010", "1011") shouldBe "10101"
}
