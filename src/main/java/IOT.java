import utilities.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

public class IOT {
    List<Integer> visited = new ArrayList<>();

    /**
     * Performs an in-order traversal of a binary tree rooted at the given node.
     * The in-order traversal visits the nodes in the following order: left child, current node, right child.
     *
     * @param rootNode the root node of the binary tree to traverse
     * @return a list of integers representing the order in which the nodes were visited during the traversal
     */
    public List<Integer> binaryInOrderTraversal(BinaryTreeNode rootNode) {
        // inorder traversal is exploring the left then the right
        // for adding nodes to explored think left>node>right

        // recursive function base case
        if (rootNode == null) {
            return visited;
        }
        // recursive calls
        binaryInOrderTraversal(rootNode.leftChild); // explore all the way down the left leg until base case
        visited.add(rootNode.value); // add the bottom left to the visited
        binaryInOrderTraversal(rootNode.rightChild); // check for a right then go all the way down the left again adding the bottom node
        return visited; // once we collapse all calls we return visited as the final answer.
    }

    public static void main(String[] args) {
        BinaryTreeNode rootNode = new BinaryTreeNode(1);
        BinaryTreeNode leftChild = new BinaryTreeNode(2);
        BinaryTreeNode rightChild = new BinaryTreeNode(3);
        rootNode.leftChild = leftChild;
        rootNode.rightChild = rightChild;

        List<Integer> inOrderTraversal = new IOT().binaryInOrderTraversal(rootNode);
        System.out.println(inOrderTraversal);
    }
}
