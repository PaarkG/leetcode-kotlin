package threeHundredNinetyTwo

import io.kotest.matchers.shouldBe

fun isSubsequence(s: String, t: String): Boolean {
    var i = 0
    var j = 0
    while (i < s.length && j < t.length) {
        if (s[i] == t[j]) i++
        j++
    }

    return i == s.length
}

fun test() {
    isSubsequence("abc", "agrabhraechrea") shouldBe true
    isSubsequence("hello world", "hello") shouldBe false
    isSubsequence("hello world", "hello world") shouldBe true
}
