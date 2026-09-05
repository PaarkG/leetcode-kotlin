import eight.myAtoi
import io.kotest.matchers.equality.shouldBeEqualUsingFields
import io.kotest.matchers.shouldBe
import nine.isPalindrome
import one.twoSum
import twenty.isValid
import twentyOne.ListNode
import twentyOne.mergeTwoLists

fun main() {
    twoSum(intArrayOf(1,2,3), 5) shouldBe intArrayOf(1, 2)
    twoSum(intArrayOf(-1, 12, 8, 55), 54) shouldBe intArrayOf(0, 3)

    myAtoi("-25") shouldBe -25
    myAtoi("0") shouldBe 0
    myAtoi("462523") shouldBe 462523

    isPalindrome(121) shouldBe true
    isPalindrome(-121) shouldBe false
    isPalindrome(855) shouldBe false

    isValid("{ test ( string )}") shouldBe true
    isValid("{{]]]") shouldBe false
    isValid("{{}") shouldBe false

    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next?.next = ListNode(4)

    val list2 = ListNode(1)
    list2.next = ListNode(3)
    list2.next?.next = ListNode(4)

    val list3 = ListNode(1)
    list3.next = ListNode(1)
    list3.next?.next = ListNode(2)
    list3.next?.next?.next = ListNode(3)
    list3.next?.next?.next?.next = ListNode(4)
    list3.next?.next?.next?.next?.next = ListNode(4)
    mergeTwoLists(list1, list2)?.shouldBeEqualUsingFields(list3)
}