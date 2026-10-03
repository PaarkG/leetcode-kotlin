package oneHundredTwelve

import io.kotest.matchers.shouldBe
import oneHundredFour.TreeNode

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) return false
    val remaining = targetSum - root.`val`
    if (remaining == 0 && root.left == null && root.right == null) return true
    return hasPathSum(root.left, remaining) || hasPathSum(root.right, remaining)
}

fun test() {
    val root1 = TreeNode(1, TreeNode(2), TreeNode(3, TreeNode(4)))
    val root2 = TreeNode(1, TreeNode(2, TreeNode(3, TreeNode(4))))
    hasPathSum(root1, 3) shouldBe true
    hasPathSum(root1, 4) shouldBe false
    hasPathSum(root2, 10) shouldBe true
    hasPathSum(root2, 6) shouldBe false
}
