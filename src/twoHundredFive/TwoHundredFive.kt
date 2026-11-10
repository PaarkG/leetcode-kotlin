package twoHundredFive

import io.kotest.matchers.shouldBe

fun isIsomorphic(s: String, t: String): Boolean {
    val transform = HashMap<Char, Char>()

    for (i in s.indices) {
        if (transform.containsKey(s[i]) || transform.containsValue(t[i])) {
            if (transform[s[i]] != t[i]) return false
        }

        transform[s[i]] = t[i]
    }

    return true
}

fun test() {
    isIsomorphic("abc", "123") shouldBe true
    isIsomorphic("abd", "123") shouldBe true
    isIsomorphic("abd", "122") shouldBe false
    isIsomorphic("add", "123") shouldBe false
}
