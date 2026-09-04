package nine

fun isPalindrome(x: Int): Boolean {
    val str = x.toString()

    var lo = 0
    var hi = str.length - 1

    while (lo <= hi) {
        if (str[lo] != str[hi]) {
            return false
        }

        lo++
        hi--
    }

    return true
}
