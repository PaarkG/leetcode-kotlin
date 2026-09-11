package oneHundredFour

import io.kotest.matchers.shouldBe

data class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null)

fun maxDepth(root: TreeNode?): Int {
    return when (root) {
        null -> 0
        else -> {
            val left = maxDepth(root.left)
            val right = maxDepth(root.right)
            if (left > right) left + 1 else right + 1
        }
    }
}

fun test() {
    val root1 = TreeNode(1, TreeNode(2), TreeNode(3, TreeNode(4)))
    val root2 = TreeNode(1, TreeNode(2, TreeNode(3, TreeNode(4))))
    maxDepth(root1) shouldBe 3
    maxDepth(root2) shouldBe 4
    maxDepth(null) shouldBe 0
}