//import palindromeLinkedList.ListNode;
//import palindromeLinkedList.palindromeLinkedList;
//import middleOfTheLinkedList.middleOfTheLinkedList;
//import middleOfTheLinkedList.ListNode;

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

        /*
        fizzBuzz fizzBuzz = new fizzBuzz();
        System.out.println(fizzBuzz.solution(3));
        System.out.println(fizzBuzz.solution(5));
        System.out.println(fizzBuzz.solution(15));
        */

        /*
        middleOfTheLinkedList middleOfTheLinkedList = new middleOfTheLinkedList();
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        System.out.println(middleOfTheLinkedList.middleNode(listNode));
        System.out.println(middleOfTheLinkedList.middleNode(listNode2));
        */

        /*
        kWeakestRows kWeakestRows = new kWeakestRows();
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int[][] mat2 = {{1,0,0,0}, {1,1,1,1}, {1,0,0,0}, {1,0,0,0}};  
        System.out.println(kWeakestRows.output(mat, 3));
        System.out.println(kWeakestRows.output(mat2, 2));
        */

        /*
        numberOfSteps numberOfSteps = new numberOfSteps();
        System.out.println(numberOfSteps.getSteps(14));
        System.out.println(numberOfSteps.getSteps(8));
        System.out.println(numberOfSteps.getSteps(123));
        */

        /*
        palindromePartitioning palindromePartitioning = new palindromePartitioning();
        System.out.println(palindromePartitioning.partition("aab"));
        System.out.println(palindromePartitioning.partition("a"));
        System.out.println(palindromePartitioning.partition("cbbbcc"));
        */

        /*
        findTheTownJudge findTheTownJudge = new findTheTownJudge();
        System.out.println(findTheTownJudge.findJudge(2, new int[][] {{1,2}}));
        System.out.println(findTheTownJudge.findJudge(3, new int[][] {{1,3},{2,3}}));
        System.out.println(findTheTownJudge.findJudge(3, new int[][] {{1,3},{2,3},{3,1}}));
        */

        /*
        findClosestNodeToGivenTwoNodes findClosestNodeToGivenTwoNodes = new findClosestNodeToGivenTwoNodes();
        System.out.println(findClosestNodeToGivenTwoNodes.closestMeetingNode(new int[] {2, 2, 3, -1}, 0, 1));
        System.out.println(findClosestNodeToGivenTwoNodes.closestMeetingNode(new int[] {1, 2, -1}, 0, 2));
        System.out.println(findClosestNodeToGivenTwoNodes.closestMeetingNode(new int[]{9,8,7,0,5,6,1,3,2,2}, 1, 6));
        */

        /*
        cheapestFlightWithinKStops cheapestFlightWithinKStops = new cheapestFlightWithinKStops();
        System.out.println(cheapestFlightWithinKStops.findCheapestPrice(4, new int[][] {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}}, 0, 3, 1));
        System.out.println(cheapestFlightWithinKStops.findCheapestPrice(3, new int[][] {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 1));
        System.out.println(cheapestFlightWithinKStops.findCheapestPrice(3, new int[][] {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}}, 0, 2, 0));
        */

        richestCostumerWealth richestCostumerWealth = new richestCostumerWealth();
        System.out.println(richestCostumerWealth.maximumWealth(new int[][] {{1,2,3},{3,2,1}}));
        System.out.println(richestCostumerWealth.maximumWealth(new int[][] {{1,5},{7,3},{3,5}}));
        System.out.println(richestCostumerWealth.maximumWealth(new int[][] {{2,8,7},{7,1,3},{1,9,5}}));
    }
}
