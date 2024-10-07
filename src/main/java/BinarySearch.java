import utilities.BinaryTreeNode;

public class BinarySearch {

    /**
     * Performs a binary search on the given array to find the target element.
     *
     * @param sortedArray the array to be searched
     * @param target the element to be found
     * @return the index of the target element if found, or -1 if not found
     */
    public static int binarySearch(int[] sortedArray, int target) {

        // left bounds of the current search. This should always start at the beginning of the array and be moved
        // inward if the number is higher than the current middle.
        int leftIndex = 0;
        // right bounds of the current search. This should always start at the end of the array and be moved inward
        // if the number is lower than the current middle.
        int rightIndex = sortedArray.length - 1;

        // the algo ends when the left and right pointers are at the same index or backwards.
        // using a while loop because we don't know how many iterations
        while (leftIndex <= rightIndex) {
            // this will find the middle index of the current array/subarray. The `leftIndex +` avoids index overflow
            // right - left = subarray size between left and right, / 2 = the middle of the subarray, + left gives us
            // the actual index of our next mid.
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

            // check for a match first and return. This is first for efficiency
            if (sortedArray[middleIndex] == target) {
                return middleIndex;
            }
            // if we are lower than the target move left up to the middle + 1
            else if (sortedArray[middleIndex] < target) {
                leftIndex = middleIndex + 1;
            }
            // only other case (we are higher than the target) move the right down to the middle - 1
            else {
                rightIndex = middleIndex - 1;
            }
        }
        // we have exited the loop without returning the answer so return -1 to signify not found.
        return -1;
    }

    /**
     * Searches for a target value in a binary search tree.
     *
     * @param rootNode the root node of the binary search tree
     * @param target the value to be searched for
     * @return the node containing the target value if found, or null if not found
     */
    public static BinaryTreeNode binarySearchTree(BinaryTreeNode rootNode, int target) {
        BinaryTreeNode current = rootNode;

        // if we travel to a null child we know the val does not exist
        while(current != null) {
            if (target == current.value) return current; // found a match!
            current = (target < current.value) ? current.leftChild : current.rightChild; // keep looking left or right
        }
        return null; // hit a leaf node with no match
    }

    /**
     * Builds a binary search tree from a given sorted array.
     *
     * @param sortedArray the array to be used for building the binary search tree
     * @return the root node of the constructed binary search tree
     */
    public static BinaryTreeNode binarySearchTreeBuilder(int[] sortedArray) {
        // Recursive problem - find the middle of the array, that should be our best root option
        // as everything left of mid is less and everything right is more.
        // This is a repeatable action and so recursion may be a good option
        // Time: n
        // Space: logN
        int length = sortedArray.length;
        if (length == 0) return null; // easy win edge case
        return builder(sortedArray, 0, length - 1); // recursive call to the builder
    }

    // Recursive helper builds the BST one node at a time using the middle value of the array
    // startIndex and endIndex are this iterations slice of nums
    private static BinaryTreeNode builder(int[] array, int startIndex, int endIndex){
        if(startIndex > endIndex) // Base case, collapsing the stack
            return null;
        int middle = startIndex + (endIndex - startIndex) / 2; // proper way to find middle of a subarray
        BinaryTreeNode node = new BinaryTreeNode(array[middle]); // our next node in the tree
        node.leftChild = builder(array, startIndex, middle - 1); // recurse the left side
        node.rightChild = builder(array, middle + 1, endIndex); // recurse the right side
        return node; // returning the nodes from the end to the beginning as the stack collapses
    }






    public static void main(String[] args) {
        int[] sortedArray = {2,10,12,17,29,31,42,59,69,75,84,99};
        int target = 2;
        int result = binarySearch(sortedArray, target);
        System.out.println(result);


        BinaryTreeNode rootNode = binarySearchTreeBuilder(sortedArray);
        System.out.println("Root value: " + rootNode.value + ", left value: " +
                rootNode.leftChild.value + ", right value: " + rootNode.rightChild.value);
    }
}
