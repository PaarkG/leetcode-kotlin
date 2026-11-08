package thirtySix

import io.kotest.matchers.shouldBe

fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (i in 0 .. 8) {
        if (!checkRow(board, i) || !checkCol(board, i) || !checkBox(board, i)) return false
    }

    return true
}

private fun checkRow(board: Array<CharArray>, index: Int): Boolean {
    val row = board[index]
    val seen = HashSet<Int>()

    for (char in row) {
        val num = char.code - 48
        if (char != '.' && seen.contains(num)) return false
        seen.add(num)
    }

    return true
}

private fun checkCol(board: Array<CharArray>, index: Int): Boolean {
    val seen = HashSet<Int>()

    for (i in 0 .. 8) {
        val char = board[i][index]
        val num = char.code - 48
        if (char != '.' && seen.contains(num)) return false
        seen.add(num)
    }

    return true
}

private fun checkBox(board: Array<CharArray>, index: Int): Boolean {
    val leftX = (index * 3) % 9
    val leftY = (index / 3) * 3

    val seen = HashSet<Int>()
    for (i in leftX .. leftX + 2) {
        for (j in leftY .. leftY + 2) {
            val char = board[i][j]
            val num = char.code - 48
            if (char != '.' && seen.contains(num)) return false
            seen.add(num)
        }
    }

    return true
}

fun test() {
    isValidSudoku(arrayOf(
        charArrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9'),
        charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
        charArrayOf('7', '8', '9', '1', '2', '3', '4', '5', '6'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
    )) shouldBe true

    isValidSudoku(arrayOf(
        charArrayOf('2', '3', '1', '2', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('7', '8', '9', '1', '2', '3', '4', '5', '6'),
        charArrayOf('4', '5', '6', '7', '8', '9', '1', '2', '3'),
        charArrayOf('.', '8', '1', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
        charArrayOf('.', '.', '.', '.', '.', '.', '.', '.', '.'),
    )) shouldBe false
}
