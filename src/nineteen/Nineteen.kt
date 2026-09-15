package nineteen

import io.kotest.matchers.equality.shouldBeEqualUsingFields
import io.kotest.matchers.shouldBe
import twentyOne.ListNode

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var len = 0
    var ptr = head
    while (ptr != null) {
        len++
        ptr = ptr.next
    }

    ptr = head
    var ctr = 0
    while (ctr < len - n - 1) {
        ctr++
        ptr = ptr!!.next
    }

    if (len <= 1 && ctr == 0 || len <= n) return head?.next
    ptr!!.next = ptr.next?.next
    return head
}

fun test() {
    val list1 = ListNode(1)
    list1.next = ListNode(2)
    list1.next!!.next = ListNode(3)

    val list2 = ListNode(1)
    list2.next = ListNode(2)

    val list3 = ListNode(1)

    removeNthFromEnd(list1, 1)?.shouldBeEqualUsingFields(list2)
    removeNthFromEnd(list3,1) shouldBe null
}
