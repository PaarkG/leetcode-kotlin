package sixtyTwo

import io.kotest.matchers.shouldBe

fun uniquePaths(m: Int, n: Int): Int {
    val grid = Array<IntArray>(n) { IntArray(m) }

    for (i in 0 ..< n) {
        for (j in 0 ..< m) {
            if (i == 0 && j == 0) {
                grid[i][j] = 1
            } else if (i > 0 && j > 0) {
                grid[i][j] = grid[i - 1][j] + grid[i][j - 1]
            } else {
                grid[i][j] = 1
            }
        }
    }

    return grid[n - 1][m - 1]
}

fun test() {
    uniquePaths(1, 2) shouldBe 1
    uniquePaths(2, 2) shouldBe 2
    uniquePaths(3, 3) shouldBe 6
}
