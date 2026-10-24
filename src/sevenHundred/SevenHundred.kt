package sevenHundred

import io.kotest.matchers.shouldBe
import oneHundredFour.TreeNode

fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    return when {
        root == null -> null
        root.`val` == `val` -> root
        root.`val` > `val` -> searchBST(root.left, `val`)
        else -> searchBST(root.right, `val`)
    }
}

fun test() {
    val tree = TreeNode(1, TreeNode(-1), TreeNode(3, TreeNode(2)))
    searchBST(tree, 0) shouldBe null
    searchBST(tree, 1) shouldBe tree
    searchBST(tree, 2) shouldBe tree.right?.left
}
