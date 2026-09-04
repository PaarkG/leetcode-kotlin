import eight.myAtoi
import io.kotest.matchers.shouldBe
import nine.isPalindrome
import one.twoSum

fun main() {
    twoSum(intArrayOf(1,2,3), 5) shouldBe intArrayOf(1, 2)
    twoSum(intArrayOf(-1, 12, 8, 55), 54) shouldBe intArrayOf(0, 3)

    myAtoi("-25") shouldBe -25
    myAtoi("0") shouldBe 0
    myAtoi("462523") shouldBe 462523

    isPalindrome(121) shouldBe true
    isPalindrome(-121) shouldBe false
    isPalindrome(855) shouldBe false
}