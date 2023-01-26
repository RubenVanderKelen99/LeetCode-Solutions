import java.util.ArrayList;
import java.util.List;

// 20 Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/
public class validParentheses {
    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        List<Character> leadingChars = new ArrayList<>();
        for (char a : s.toCharArray()) {
            if(a == '(' || a == '{' || a == '[') {
                leadingChars.add(a);
            }
            else {
                if(leadingChars.size() == 0 || !control(leadingChars.get(leadingChars.size() - 1), a)) {
                    return false;
                }
                leadingChars = leadingChars.subList(0, leadingChars.size() - 1);
            }    
        }

        if(leadingChars.size() != 0) return false;
        
        return true;
    }
    
    private boolean control(char a, char b) {
        switch (a) {
            case '(':
                if(b == ')') return true;    
                break;
            case '{':
                if(b == '}') return true;   
                break;
            case '[':
                if(b == ']') return true;   
            break;
            default:
                return false;
        }

        return false;
    }
}
