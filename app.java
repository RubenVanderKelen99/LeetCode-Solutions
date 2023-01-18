public class app {
    public static void main(String[] args) throws Exception {
        /*romanToInt romanToInt = new romanToInt();
        System.out.println(romanToInt.solution("III"));
        System.out.println(romanToInt.solution("LVIII"));
        System.out.println(romanToInt.solution("MCMXCIV"));
        */
        ransomNote ransomNote = new ransomNote();
        System.out.println(ransomNote.canConstruct("a", "b"));
        System.out.println(ransomNote.canConstruct("aa", "ab"));
        System.out.println(ransomNote.canConstruct("aa", "aab"));
    }
}
