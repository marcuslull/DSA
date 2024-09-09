import utilities.BinaryTreeNode;
import utilities.LinkedList;

import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Deque<Integer> deque = new java.util.LinkedList<>();

        System.out.println("BINARY SEARCH----------------------------------------------------------------------------");
        // binary search data set
        int[] sortedArray = {2,10,12,17,29,31,42,59,69,75,84,99};
        int target = 0;
        // implement binary search here




        System.out.println("FIBONACCI--------------------------------------------------------------------------------");
        // fibonacci data set
        int nthNumber = 3;
        // reference: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // implement fibonacci calculator here




        System.out.println("TWO POINTERS FAST SLOW-------------------------------------------------------------------");
        // two pointers fastAndSlow data set
        // nodes are a `Node` and linkedList has a `head`
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(9);
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(7);
        linkedList.add(0);
        // implement fastAndSlowFindMiddle here





        linkedList.completeTheLoop(2);
        // implement fastAndSlowFindLoop here




        System.out.println("TWO POINTERS SLIDING WINDOW--------------------------------------------------------------");
        int[] intArray = new int[] {7,1,5,3,6,4};
//        int[] intArray = new int[] {7,6,4,3,1};
        // implement sliding window here




        System.out.println("BT IN-ORDER TRAVERSAL--------------------------------------------------------------------");
        // Binary Tree In-order traversal
        // nodes are `BinaryTreeNode`
        BinaryTreeNode rootNode = new BinaryTreeNode(1);
        BinaryTreeNode leftChild = new BinaryTreeNode(2);
        BinaryTreeNode rightChild = new BinaryTreeNode(3);
        rootNode.leftChild = leftChild;
        rootNode.rightChild = rightChild;
        leftChild.rightChild = new BinaryTreeNode(4);
        rightChild.rightChild = new BinaryTreeNode(5);
        List<Integer> answer = new IOT().binaryInOrderTraversal(rootNode);
        System.out.println("Answer should be: " + answer);
//        List<Integer> result = inOrderTraversal(rootNode);
//        System.out.println("Result: " + result);
        // implement inOrderTraversal(rootNode) as a private static method after psvm and uncomment above lines
    }
}
