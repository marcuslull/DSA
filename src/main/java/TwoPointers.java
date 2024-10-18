import utilities.LinkedList;
import utilities.Node;

import java.util.ArrayList;
import java.util.List;

public class TwoPointers {

    /**
     * Finds the middle node of the provided linked list using the fast and slow pointer technique.
     * The method prints the data of the middle node.
     *
     * @param linkedList The linked list in which the middle node is to be found.
     */
    public static void fastAndSlowFindMiddle(LinkedList linkedList) {
        Node slowPointer = linkedList.head;
        Node fastPointer = linkedList.head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        assert slowPointer != null;
        System.out.println("The middle is data is: " + slowPointer.data);
    }

    /**
     * Detects if there is a loop in the given linked list using the fast and slow pointer technique.
     * The method prints a message if a loop is detected.
     *
     * @param linkedList The linked list to be checked for a loop.
     */
    public static void fastAndSlowFindLoop(LinkedList linkedList) {
        Node slowPointer = linkedList.head;
        Node fastPointer = linkedList.head.next;

        while (fastPointer != null && fastPointer.next != null) {
            if (slowPointer == fastPointer) {
                System.out.println("We have a loop in the linked list");
                break;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
    }

    /**
     * Checks if the given string is a palindrome, ignoring non-alphanumeric characters and case,
     * and prints a message indicating the result.
     *
     * @param s The string to be checked for being a palindrome.
     */
    public static void bothEndsPalindrome(String s) {
        List<Character> characterList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                characterList.add(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right = characterList.size() - 1;
        while(left < right) {
            if (characterList.get(left) != characterList.get(right)) {
                System.out.println(s + " - is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(s + " - is a palindrome!");
    }

    /**
     * Finds the maximum difference between any two elements such that the larger element
     * comes after the smaller element in the given array. The method prints the maximum difference.
     *
     * @param array The array of integers in which to find the maximum difference between any two elements
     * such that the larger element comes after the smaller element.
     */
    public static void slidingWindow(int[] array) {
        int leftIndex = 0;
        int rightIndex = leftIndex + 1;
        int maxDifference = 0;
        while (rightIndex < array.length) {
            if (array[rightIndex] < array[leftIndex]) {
                leftIndex = rightIndex;
                rightIndex = leftIndex + 1;
                continue;
            }
            int currentDifference = array[rightIndex] - array[leftIndex];
            if (currentDifference > maxDifference) {
                maxDifference = currentDifference;
            }
            rightIndex++;
        }
        System.out.println(maxDifference);
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(9);
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.add(7);
        linkedList.add(0);

        fastAndSlowFindMiddle(linkedList);

        linkedList.completeTheLoop(2);
        fastAndSlowFindLoop(linkedList);

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "A man, a pla, a canal: Panama";
        bothEndsPalindrome(s1);
        bothEndsPalindrome(s2);

        int[] intArray = new int[] {7,1,5,3,6,4};
//        int[] intArray = new int[] {7,6,4,3,1};
        slidingWindow(intArray);


        Integer.reverse(123456789);
    }
}
