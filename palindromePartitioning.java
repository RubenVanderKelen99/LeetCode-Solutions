import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class palindromePartitioning {
    List<List<String>> partitionList;
    public List<List<String>> partition(String s) {
        partitionList = new ArrayList<List<String>>();
        // List<List<String>> partitionList = new ArrayList<List<String>>();
        // Loop through the String
        // try to find a palindrome: first check for recurring characters, then check
        // inwards for a palindrome
        // start loop one from 0 and loop two from 1
        // If a palindrome has been found add the palindrome to partitionlist with
        // getIndividualCharactersStrings from the preceeding and following substrings
        for (int i = 0; i < s.length() - 1; i++) {
            List<String> newList = new ArrayList<String>();
            for (int j = s.length() - 1; j > 0 + i; j--) {
                newList = new ArrayList<String>();
                // System.out.println(s.charAt(j));
                if (s.charAt(i) == s.charAt(j)) {
                    // recurring characters have been found at differing index of string
                    // check inwards for a palindrome in the new substring = s(from i, to j)
                    String stringToCheck = s.substring(i, j + 1);
                    if (isPalindrome(stringToCheck)) {
                        // add stringtocheck aswell as all other possible palindromes and the
                        // remaining characters
                        if (i > 0) {
                            System.out.println("substring is: " + s.substring(0, i));
                            newList.addAll(getIndividualCharactersStrings(s.substring(0, i)));
                        }
                        newList.add(stringToCheck);
                        if (j + 1 < s.length()) {
                            System.out.println(s.substring(j + 1, s.length()));
                            getExtraPartitions(s.substring(j + 1, s.length()), newList);
                            newList.addAll(getIndividualCharactersStrings(s.substring(j + 1, s.length())));
                        }
                        partitionList.add(newList);
                    }

                }
            }
        }

        List<String> charList = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            charList.add(Character.toString(s.charAt(i)));
        }

        partitionList.add(charList);

        return partitionList;
    }

    public void getExtraPartitions(String remainingString, List<String> partitionBegin) {
        for (int i = 0; i < remainingString.length() - 1; i++) {
            List<String> newList = new ArrayList<String>();
            for (int j = remainingString.length() - 1; j > 0 + i; j--) {
                newList = new ArrayList<String>();
                if (remainingString.charAt(i) == remainingString.charAt(j)) {
                    String stringToCheck = remainingString.substring(i, j + 1);
                    if (isPalindrome(stringToCheck)) {
                        newList.addAll(partitionBegin);
                        if (i > 0) {
                            System.out.println("substring is: " + remainingString.substring(0, i));
                            newList.addAll(getIndividualCharactersStrings(remainingString.substring(0, i)));
                        }
                        newList.add(stringToCheck);
                        if (j + 1 < remainingString.length()) {
                            System.out.println(remainingString.substring(j + 1, remainingString.length()));
                            getExtraPartitions(remainingString.substring(j + 1, remainingString.length()), newList);
                            newList.addAll(getIndividualCharactersStrings(remainingString.substring(j + 1, remainingString.length())));
                        }
                        partitionList.add(newList);
                    }

                }                
            }
        }
    }

    public List<String> getIndividualCharactersStrings(String stringToConvert) {
        List<String> individualCharactersStrings = new ArrayList<String>();
        for (int i = 0; i < stringToConvert.length(); i++) {
            individualCharactersStrings.add(Character.toString(stringToConvert.charAt(i)));
        }
        return individualCharactersStrings;
    }

    public boolean isPalindrome(String stringToCheck) {
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
