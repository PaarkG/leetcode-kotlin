package nineHundredThirtyThree

import io.kotest.matchers.shouldBe

class RecentCounter() {
    val queue = ArrayDeque<Int>()

    fun ping(t: Int): Int {
        while (queue.isNotEmpty() && queue.first() < t - 3000) queue.removeFirst()
        queue.addLast(t)
        return queue.size
    }
}

fun test() {
    val c = RecentCounter()
    c.ping(1) shouldBe 1
    c.ping(2) shouldBe 2
    c.ping(5000) shouldBe 1
    c.ping(5050) shouldBe 2
}
