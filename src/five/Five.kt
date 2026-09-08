package five

import io.kotest.matchers.shouldBe

fun longestPalindrome(s: String): String {
    var result = ""

    // case of odd palindrome
    for (i in s.indices) {
        var leftmost = i - 1
        var rightmost = i + 1

        while (leftmost >= 0 && rightmost < s.length && s[leftmost] == s[rightmost]) {
            val substring = s.substring(leftmost, rightmost + 1)
            if (substring.length > result.length) result = substring
            leftmost--
            rightmost++
        }
    }

    // case of just one character or even palindrome
    for (i in s.indices) {
        var leftmost = i
        var rightmost = i + 1

        while (leftmost >= 0 && rightmost < s.length && s[leftmost] == s[rightmost]) {
            val substring = s.substring(leftmost, rightmost + 1)
            if (substring.length > result.length) result = substring
            leftmost--
            rightmost++
        }
    }

    if (result.isEmpty()) return s[0].toString()

    return result
}

fun test() {
    longestPalindrome("tacocat") shouldBe "tacocat"
    longestPalindrome("hello") shouldBe "ll"
    longestPalindrome("abc").length shouldBe 1
}
