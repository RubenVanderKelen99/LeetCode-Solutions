import palindromeLinkedList.ListNode;
import palindromeLinkedList.palindromeLinkedList;

public class app {
    public static void main(String[] args) throws Exception {

        /*
        romanToInt romanToInt = new romanToInt();
        System.out.println(romanToInt.solution("III"));
        System.out.println(romanToInt.solution("LVIII"));
        System.out.println(romanToInt.solution("MCMXCIV"));
        */
        
        /*
        ransomNote ransomNote = new ransomNote();
        System.out.println(ransomNote.canConstruct("a", "b"));
        System.out.println(ransomNote.canConstruct("aa", "ab"));
        System.out.println(ransomNote.canConstruct("aa", "aab"));
        */

        /*
        palindromeLinkedList palindromeLinkedList = new palindromeLinkedList();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        ListNode listNode2 = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println(palindromeLinkedList.isPalindrome(listNode));
        System.out.println(palindromeLinkedList.isPalindrome(listNode2));
        */

        fizzBuzz fizzBuzz = new fizzBuzz();
        System.out.println(fizzBuzz.solution(3));
        System.out.println(fizzBuzz.solution(5));
        System.out.println(fizzBuzz.solution(15));       
    }
}
