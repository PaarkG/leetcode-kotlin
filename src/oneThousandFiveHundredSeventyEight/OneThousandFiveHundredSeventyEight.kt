package oneThousandFiveHundredSeventyEight

import io.kotest.matchers.shouldBe

fun minCost(colors: String, neededTime: IntArray): Int {
    var i = 0
    var j = 0
    var cost = 0

    while (i < colors.length) {
        j = i
        var max = 0
        var sum = 0
        while (j < colors.length && colors[j] == colors[i]) {
            sum += neededTime[j]
            max = maxOf(neededTime[j], max)
            j++
        }
        cost += sum - max
        i = j
    }

    return cost
}

fun test() {
    minCost("abc", intArrayOf(1, 2, 3)) shouldBe 0
    minCost("abbbc", intArrayOf(1, 2, 5, 2, 3)) shouldBe 4
    minCost("acbbc", intArrayOf(1, 2, 5, 6, 3)) shouldBe 5
}
