package oneHundredTwentyFive

import io.kotest.matchers.shouldBe

fun isPalindrome(s: String): Boolean {
    val str = s.trim().lowercase().filter { c -> c.isLetterOrDigit() }
    var left = 0
    var right = str.length - 1

    while (left < right) {
        if (str[left] != str[right]) return false
        left++
        right--
    }

    return true
}

fun test() {
    isPalindrome("racecar") shouldBe true
    isPalindrome("ra::c,e car") shouldBe true
    isPalindrome("ra::car") shouldBe false
}
