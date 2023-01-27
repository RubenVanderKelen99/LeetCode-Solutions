// 420. Strong Password Checker
// https://leetcode.com/problems/strong-password-checker/description/

public class strongPasswordChecker {
    // Constraint A: Length
    // Constraint B: Uppercase/Lowercase/Digit
    // Constraint C: Repeating characters
    // Possible Fixes: insert, edit or remove a character then count the steps
    // Best possible fix for:
    // Constraint A: ADD/REMOVE new characters WITHOUT creating repeating characters
    // Constraint B: add one of the missing type by EDITING a character
    // Constraint C: break up the repeating characters by EDITING the last character of the 3 character string
    // Constraint A + B: ADD characters of one of the missing types, REMOVE characters from the most common type
    // Constraint B + C: break up the repeating characters by EDITING the last character of the 3 character string into one of the missing types
    // Constraint A + C: ADD characters in between the last character of repeating characters, REMOVE the last character from repeating characters
    // Constraint A + B + C: ADD characters of one of the missing types in between the last character of repeating characters, REMOVE the last character from repeating characters
    public int stepsToStrongPassword(String password) {
        //2 flags for length: short/long?
        boolean[] constraintFlags = new boolean[3];
        int steps = 0;
        if(isStrong(password)) {
            System.out.println("Strong");
            return 0;    
        }
        System.out.println("weak");
        return 0;
    }
    
    private boolean isStrong(String password) {
        char ch;
        boolean numberFlag, capitalFlag, lowerCaseFlag;
        numberFlag = capitalFlag = lowerCaseFlag = false;
        if(password.length() < 6 || password.length() > 20) {
            return false;
        }

        if(password.length() > 2) {
            for (int i = 0; i < password.length() - 2; i++) {
                if(password.charAt(i) != password.charAt(i + 1)) continue;
                if(password.charAt(i + 1) == password.charAt(i + 2)) return false; 
            }
        }

        for (int j = 0; j < password.length(); j++) {
            ch = password.charAt(j);
            if (Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            }
            else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            if(numberFlag == true && capitalFlag == true && lowerCaseFlag == true) return true;
        }

        return false;
    }
}
