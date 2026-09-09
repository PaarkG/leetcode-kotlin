package eightyEight

import io.kotest.matchers.shouldBe

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val auxNums1 = nums1.clone()

    var mCounter = 0
    var nCounter = 0

    while (mCounter < m && nCounter < n) {
        if (mCounter >= m || auxNums1[mCounter] > nums2[nCounter]) {
            nums1[mCounter + nCounter] = nums2[nCounter]
            nCounter++
        } else {
            nums1[mCounter + nCounter] = auxNums1[mCounter]
            mCounter++
        }
    }

    if (mCounter < m) for (i in mCounter ..< m) {
        nums1[mCounter + nCounter] = auxNums1[mCounter]
        mCounter++
    }

    if (nCounter < n) for (i in nCounter ..< n) {
        nums1[mCounter + nCounter] = nums2[nCounter]
        nCounter++
    }
}

fun test() {
    val m1 = intArrayOf(3, 6, 8, -1, -1, -1, -1)
    val n1 = intArrayOf(2, 7, 8, 12)
    merge(m1, 3, n1, 4)
    m1 shouldBe intArrayOf(2, 3, 6, 7, 8, 8, 12)

    val m2 = intArrayOf(-1, -1)
    val n2 = intArrayOf(5, 6)
    merge(m2, 0, n2, 2)
    m2 shouldBe intArrayOf(5, 6)

    val m3 = intArrayOf(4, 5, 6)
    val n3 = intArrayOf()
    merge(m3, 3, n3, 0)
    m3 shouldBe intArrayOf(4, 5, 6)
}
