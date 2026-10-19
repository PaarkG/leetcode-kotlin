package oneThousandSeventyOne

import io.kotest.matchers.shouldBe

fun gcdOfStrings(str1: String, str2: String): String {
    var length = 0

    for (i in 1 .. minOf(str1.length, str2.length)) {
        val sub1 = str1.substring(0, i)
        val sub2 = str2.substring(0, i)

        if (sub1 == sub2 && divides(str1, sub1) && divides(str2, sub2)) length = i
    }

    return str1.substring(0, length)
}

private fun divides(str: String, div: String): Boolean {
    return str.length % div.length == 0 && div.repeat(str.length / div.length) == str
}

fun test() {
    gcdOfStrings("hello", "world") shouldBe ""
    gcdOfStrings("123", "123123123") shouldBe "123"
    gcdOfStrings("testtest", "test") shouldBe "test"
}
