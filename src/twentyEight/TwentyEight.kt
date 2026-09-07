package twentyEight

import io.kotest.matchers.shouldBe

fun strStr(haystack: String, needle: String): Int {
    for (i in 0 ..< haystack.length + 1 - needle.length) {
        if (haystack.substring(i, i + needle.length) == needle) {
            return i
        }
    }

    return -1
}

fun test() {
    strStr("test", "est") shouldBe 1
    strStr("my haystack", "haystack") shouldBe 3
    strStr("my haystack", "needle") shouldBe -1
}
