package oneHundredTen

import io.kotest.matchers.shouldBe
import oneHundredFour.TreeNode
import kotlin.math.abs

fun isBalanced(root: TreeNode?): Boolean {
    return when (root) {
        null -> true
        else -> {
            val balanced = abs(height(root.left) - height(root.right)) <= 1
            balanced && isBalanced(root.left) && isBalanced(root.right)
        }
    }
}

fun height(root: TreeNode?) : Int {
    return when (root) {
        null -> 0
        else -> 1 + maxOf(height(root.left), height(root.right))
    }
}

fun test() {
    val root1 = TreeNode(1, TreeNode(2), TreeNode(3, TreeNode(4)))
    val root2 = TreeNode(1, TreeNode(2, TreeNode(3, TreeNode(4))))

    isBalanced(root1) shouldBe true
    isBalanced(root2) shouldBe false
}
