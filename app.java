public class app {
    public static void main(String[] args) throws Exception {
        romanToInt romanToInt = new romanToInt();
        System.out.println(romanToInt.solution("III"));
        System.out.println(romanToInt.solution("LVIII"));
        System.out.println(romanToInt.solution("MCMXCIV"));
    }
}
