package twoHundredTwentyFive

import io.kotest.matchers.shouldBe
import java.util.Queue
import java.util.LinkedList

class MyStack() {
    val q: Queue<Int> = LinkedList<Int>()

    fun push(x: Int) {
        val temp = LinkedList<Int>()
        while (q.isNotEmpty()) {
            temp.add(q.remove())
        }

        q.add(x)
        while (temp.isNotEmpty()) {
            q.add(temp.remove())
        }
    }

    fun pop(): Int {
        return q.poll()
    }

    fun top(): Int {
        return q.peek()
    }

    fun empty(): Boolean {
        return q.isEmpty()
    }
}

fun test() {
    val myStack = MyStack()
    myStack.push(1)
    myStack.push(2)
    myStack.push(3)
    myStack.pop() shouldBe 3
    myStack.top() shouldBe 2
    myStack.pop() shouldBe 2
    myStack.empty() shouldBe false
    myStack.pop() shouldBe 1
    myStack.empty() shouldBe true
}
