// 876. Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/
package middleOfTheLinkedList;

public class middleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        // if ListNode has only 1 value, return true
        if (head.next == null) {
            return new ListNode(head.val);
        }

        int len = 1;
        ListNode resultListNode = head;

        while (head.next != null) {
            len++;
            head = head.next;             
        }
        
        len = len/2;

        while(len > 0) {
            len--;
            resultListNode = resultListNode.next;
        }

        return resultListNode;

    }
}
