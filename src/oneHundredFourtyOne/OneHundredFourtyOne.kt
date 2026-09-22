package oneHundredFourtyOne

import io.kotest.matchers.shouldBe
import twentyOne.ListNode

fun hasCycle(head: ListNode?): Boolean {
    return hasCycle(head, HashSet())
}

fun hasCycle(head: ListNode?, seen: HashSet<ListNode>): Boolean {
    return when (head) {
        null -> false
        else -> {
            if (seen.contains(head)) return true
            seen.add(head)
            hasCycle(head.next, seen)
        }
    }
}

fun test() {
    var head = ListNode(0);
    var next = ListNode(1);
    head.next = next;
    var tail = ListNode(2);
    next.next = tail;

    hasCycle(head) shouldBe false

    next.next = head;

    hasCycle(head) shouldBe true
}
