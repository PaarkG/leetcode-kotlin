package oneHundred

import io.kotest.matchers.shouldBe
import oneHundredFour.TreeNode

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    return when {
        p == null || q == null -> q == null && p == null
        p.`val` == q.`val` -> isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        else -> false
    }
}

fun test() {
    val tree1 = TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)))
    val tree2 = TreeNode(0, TreeNode(2, TreeNode(3), TreeNode(4)))
    val tree3 = TreeNode(1, TreeNode(2), TreeNode(2))

    isSameTree(tree1, tree1) shouldBe true
    isSameTree(tree1, tree2) shouldBe false
    isSameTree(tree1, tree3) shouldBe false
}
