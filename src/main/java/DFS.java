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
    }
}
