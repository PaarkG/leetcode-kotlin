package oneThousandOneHundredThirtySeven

import io.kotest.matchers.shouldBe

fun tribonacci(n: Int): Int {
    if (n <= 1) return n
    if (n == 2) return 1
    val table = IntArray(n + 1)
    table[0] = 0
    table[1] = 1
    table[2] = 1

    for (i in 3 .. n) {
        table[i] = table[i - 1] + table[i - 2] + table[i - 3]
    }

    return table[n]
}

fun test() {
    tribonacci(1) shouldBe 1
    tribonacci(25) shouldBe 1389537
}
