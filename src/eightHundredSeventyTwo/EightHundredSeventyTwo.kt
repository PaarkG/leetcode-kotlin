package eightHundredSeventyTwo

import io.kotest.matchers.shouldBe
import oneHundredFour.TreeNode

fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    return leafSequence(root1) == leafSequence(root2)
}

private fun leafSequence(root: TreeNode?): List<Int> {
    val leaves = mutableListOf<Int>()

    fun dfs(node: TreeNode?) {
        if (node == null) {
            return
        } else if (node.left == null && node.right == null) {
            leaves.add(node.`val`)
        } else {
            dfs(node.left)
            dfs(node.right)
        }
    }

    dfs(root)

    return leaves
}

fun test() {
    leafSimilar(TreeNode(1), TreeNode(1)) shouldBe true
    leafSimilar(TreeNode(2, TreeNode(1)), TreeNode(1)) shouldBe true
    leafSimilar(TreeNode(2, TreeNode(2)), TreeNode(1)) shouldBe false
}
