package twentyFour

import io.kotest.matchers.equality.shouldBeEqualUsingFields
import io.kotest.matchers.shouldBe
import twentyOne.ListNode

fun swapPairs(head: ListNode?): ListNode? {
    if (head == null || head.next == null) return head
    val newHead = head.next
    var first = head
    var second = head.next
    var prev: ListNode? = null

    while (first != null && second != null) {
        first.next = second.next;
        second.next = first

        if (prev != null) prev.next = second
        prev = first

        first = first.next;
        if (first != null) second = first.next
    }

    return newHead;
}

fun test() {
    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next?.next = ListNode(4)

    val list2 = ListNode(2)
    list2.next = ListNode(1)
    list2.next?.next = ListNode(4)
    swapPairs(list1)?.shouldBeEqualUsingFields(list2)

    val list3 = ListNode(1)
    list3.next = ListNode(2)
    list3.next?.next = ListNode(3)
    list3.next?.next?.next = ListNode(4)

    val list4 = ListNode(2)
    list4.next = ListNode(1)
    list4.next?.next = ListNode(4)
    list4.next?.next?.next = ListNode(3)
    swapPairs(list3)?.shouldBeEqualUsingFields(list4)
}
