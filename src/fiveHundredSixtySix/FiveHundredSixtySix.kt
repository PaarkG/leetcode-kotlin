package fiveHundredSixtySix

import io.kotest.matchers.shouldBe

fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    if (mat.size * mat[0].size != r * c) return mat

    val newMat = Array(r) { IntArray(c) }
    var row = 0
    var col = 0

    for (list in mat) {
        for (num in list) {
            if (col >= c) {
                row++
                col = 0
            }

            newMat[row][col] = num

            col++
        }
    }

    return newMat
}

fun test() {
    matrixReshape(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)), 6, 1) shouldBe arrayOf(
        intArrayOf(1),
        intArrayOf(2),
        intArrayOf(3),
        intArrayOf(4),
        intArrayOf(5),
        intArrayOf(6)
    )

    matrixReshape(arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8)), 4, 2) shouldBe arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6),
        intArrayOf(7, 8)
    )
}
