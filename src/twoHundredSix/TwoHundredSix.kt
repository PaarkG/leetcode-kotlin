package twoHundredSix

import io.kotest.matchers.shouldBe
import twentyOne.ListNode

fun reverseList(head: ListNode?): ListNode? {
    if (head?.next == null) return head

    val reversed = reverseList(head.next)

    head.next?.next = head
    head.next = null

    return reversed
}

fun test() {
    val l1 = ListNode(1)
    l1.next = ListNode(2)
    l1.next?.next = ListNode(3)

    val l2 = ListNode(3)
    l2.next = ListNode(2)
    l2.next?.next = ListNode(1)

    val l3 = reverseList(l1)
    l3?.`val` shouldBe l2.`val`
    l3?.next?.`val` shouldBe l2.next?.`val`
    l3?.next?.next?.`val` shouldBe l2.next?.next?.`val`
}
