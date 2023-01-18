// 234. Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/
package palindromeLinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        
        // if ListNode has only 1 value, return true
        if(head.next == null) {
            return true;
        }
        // split the list in two even halves
        // check if the halves are the reverse of eachother, return true
        // else return false
        // it might be possible to mirror the second half
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (head.next != null) {
            list.add(head.val);
            head = head.next;             
        }
        list.add(head.val);
        ArrayList<Integer> firsthalf = new ArrayList<Integer>(list.subList(0, (list.size() / 2)));
        ArrayList<Integer> secondhalf = new ArrayList<Integer>(list.subList((list.size() / 2), list.size()));
        //Collections.reverse(secondhalf);

        for (int i = 0; i < firsthalf.size(); i++) {
            if(firsthalf.get(i) != secondhalf.get((secondhalf.size() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}