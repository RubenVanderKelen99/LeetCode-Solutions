// 234. Palindrome Linked List
// https://leetcode.com/problems/palindrome-linked-list/

import java.util.ArrayList;
import java.util.Collections;

public class palindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // split the list in two even halves
        // check if the halves are the reverse of eachother, return true
        // else return false
        // it might be possible to mirror the second half

        // TO-DO: check if list divisble by two else return false
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (head.next != null) {
            list.add(head.val);
            head = head.next;             
        }
        list.add(head.val);

        ArrayList<Integer> firsthalf = new ArrayList<Integer>(list.subList(0, (list.size() / 2)));
        ArrayList<Integer> secondhalf = new ArrayList<Integer>(list.subList((list.size() / 2), list.size()));
        Collections.reverse(secondhalf);

        if(firsthalf.equals(secondhalf)) {
            return true;
        }
        return false;  
    }
}