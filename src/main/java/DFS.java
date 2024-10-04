import utilities.BinaryTreeNode;
import utilities.NonBinaryTreeNode;

import java.util.List;

public class DFS {

    /**
     * Performs a depth-first search (DFS) on a binary tree starting from the given node.
     *
     * @param node The starting node of the binary tree for which DFS is to be performed. If the node is null,
     *             the method returns immediately.
     */
    public void dfsBinary(BinaryTreeNode node) {
        if (node == null) return; // edge case

        // process dive operations here
        System.out.println("Current node: " + node.value);

        dfsBinary(node.leftChild); // dive the left
        dfsBinary(node.rightChild); // if left has been explored, dive the right

        // process backtrack operations here
        System.out.println("Backtracking!");
    }

    /**
     * Performs a depth-first search (DFS) on a non-binary tree starting from the given node.
     *
     * @param node The starting node of the non-binary tree for which DFS is to be performed. If the node is null,
     *             the method returns immediately.
     */
    public void dfsNonBinary(NonBinaryTreeNode node) {
        if (node == null) return; // edge case

        // process dive operations here
        System.out.println("Current node: " + node.value);

        for (NonBinaryTreeNode n : node.children) {
            dfsNonBinary(n);
        }

        // process backtrack operations here
        System.out.println("Backtracking!");
    }


    /**
     * Performs a mirrored depth-first search (DFS) on a binary tree starting from the given node.
     *
     * @param root The starting node of the binary tree for which mirrored DFS is to be performed. If the node is null,
     *             the method returns immediately. Otherwise, making a call to recursive
     *             {@code isMirror(BinaryTreeNode left, BinaryTreeNode right)} helper function
     *             that performs a simultaneous, mirrored DFS on each child.
     *
     * @return boolean
     */
    public static boolean isSymmetric(BinaryTreeNode root) {
        // Recursive DFS problem - Compare both sides of the root at the same time in a mirror fashion
        // for the left side of the root we dive the left
        // for the right side of the root we dive the right
        // Time = n
        // Space = 1
        if (root == null) return true; // easy win edge case, no node is symmetrical
        // this will return true if all nodes are the same as we proceed through the mirrored dives
        return isMirror(root.leftChild, root.rightChild);
    }

    private static boolean isMirror(BinaryTreeNode left, BinaryTreeNode right) {
        if (left == null && right == null) return true; // easy win edge case and base case for the recurse
        // all the conditions that might make this comparison false
        if (left == null || right == null || left.value != right.value) return false;
        // recursive call - note the mirrored dive to the outside of the tree, then turning inside.
        // ands are evaluated in a serial manner to preserve short-circuit
        return isMirror(left.leftChild, right.rightChild) && isMirror(left.rightChild, right.leftChild);
    }



    public static void main(String[] args) {
        BinaryTreeNode bRoot = new BinaryTreeNode(1);
        bRoot.leftChild = new BinaryTreeNode(2);
        bRoot.rightChild = new BinaryTreeNode(3);
        bRoot.rightChild.leftChild = new BinaryTreeNode(4);
        bRoot.rightChild.leftChild.leftChild = new BinaryTreeNode(5);

        DFS dfs = new DFS();
        dfs.dfsBinary(bRoot);


        NonBinaryTreeNode nbRoot = new NonBinaryTreeNode(1);
        nbRoot.children = List.of(new NonBinaryTreeNode(2), new NonBinaryTreeNode(3), new NonBinaryTreeNode(4));
        nbRoot.children.get(1).children = List.of(new NonBinaryTreeNode(5));
        nbRoot.children.get(2).children = List.of(new NonBinaryTreeNode(6), new NonBinaryTreeNode(7));
        nbRoot.children.get(2).children.getFirst().children = List.of(new NonBinaryTreeNode(8));

        dfs.dfsNonBinary(nbRoot);


        System.out.println(isSymmetric(bRoot));
        BinaryTreeNode bRoot2 = new BinaryTreeNode(1);
        bRoot2.leftChild = new BinaryTreeNode(2);
        bRoot2.rightChild = new BinaryTreeNode(2);
        bRoot2.rightChild.leftChild = new BinaryTreeNode(3);
        bRoot2.leftChild.rightChild = new BinaryTreeNode(3);
        System.out.println(isSymmetric(bRoot2));
    }
}
