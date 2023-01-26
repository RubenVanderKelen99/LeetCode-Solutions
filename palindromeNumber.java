// 9. Palindrome Number
// https://leetcode.com/problems/palindrome-number/

public class palindromeNumber {
    public boolean isPalindrome(int x) {
        String stringToCheck = String.valueOf(x);
        System.out.println(x);
        String firstHalf = stringToCheck.substring(0, (stringToCheck.length() / 2));
        String secondHalf = stringToCheck.substring((stringToCheck.length() / 2), stringToCheck.length());
        for (int i = 0; i < firstHalf.length(); i++) {
            if (firstHalf.charAt(i) != secondHalf.charAt((secondHalf.length() - 1) - i)) {
                return false;
            }
        }
        return true;        
    }    
}
