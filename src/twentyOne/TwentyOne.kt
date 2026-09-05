package twentyOne

import io.kotest.matchers.equality.shouldBeEqualUsingFields

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var first: ListNode? = list1
    var second: ListNode? = list2
    var resultCurr: ListNode?

    if (first == null) return second
    if (second == null) return first

    if (first.`val` < second.`val`) {
        resultCurr = first
        first = first.next
    } else {
        resultCurr = second
        second = second.next
    }

    val result = resultCurr

    while (first != null && second != null) {
        if (first.`val` < second.`val`) {
            resultCurr?.next = first
            resultCurr = resultCurr?.next
            first = first.next
        } else {
            resultCurr?.next = second
            resultCurr = resultCurr?.next
            second = second.next
        }
    }

    if (first != null) {
        resultCurr?.next = first
    } else {
        resultCurr?.next = second
    }

    return result
}

fun test() {
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