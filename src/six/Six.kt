package six

import io.kotest.matchers.shouldBe

fun convert(s: String, numRows: Int): String {
    val rows = List(numRows) { StringBuilder() }

    var row = 0
    var dir = true

    for (i in s.indices) {
        if (dir && row >= numRows - 1 || !dir && row <= 0) dir = !dir

        val char = s[i]
        rows[row].append(char)

        if (dir) row++ else row--
        row = row.coerceIn(0, numRows - 1)
    }

    val sb = rows[0]
    for (i in 1 ..< numRows) sb.append(rows[i].toString())
    return sb.toString()
}

fun test() {
    convert("PAYPALISHIRING", 3) shouldBe "PAHNAPLSIIGYIR"
    convert("PAYPALISHIRING", 4) shouldBe "PINALSIGYAHRPI"
    convert("AB", 1) shouldBe "AB"
}
