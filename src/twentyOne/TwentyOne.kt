package twentyOne

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