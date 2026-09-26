package ninetyFour

import io.kotest.matchers.shouldBe
import oneHundredFour.TreeNode

fun inorderTraversal(root: TreeNode?): List<Int> {
    val list: MutableList<Int> = mutableListOf()
    inorderTraversal(root, list)
    return list
}

fun inorderTraversal(root: TreeNode?, acc: MutableList<Int>) {
    if (root == null) return
    inorderTraversal(root.left, acc)
    acc.add(root.`val`)
    inorderTraversal(root.right, acc)
}

fun test() {
    val root = TreeNode(2)
    root.left = TreeNode(1)
    root.right = TreeNode(3)

    inorderTraversal(root) shouldBe listOf(1, 2, 3)

    root.`val` = -5
    root.left = TreeNode(0)

    inorderTraversal(root) shouldBe listOf(0, -5, 3)
}
