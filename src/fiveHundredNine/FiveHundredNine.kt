package fiveHundredNine

import io.kotest.matchers.shouldBe

fun fib(n: Int): Int {
    if (n <= 1) return n
    val arr = IntArray(n + 1)
    arr[0] = 0
    arr[1] = 1
    for (i in 2 .. n) arr[i] = arr[i - 1] + arr[i - 2]
    return arr[n]
}

fun test() {
    fib(5) shouldBe 5
    fib(1) shouldBe 1
    fib(0) shouldBe 0
    fib(12) shouldBe 144
}
