// 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        if(strs.length == 1) {
            return strs[0];
        }

        if(strs[0].length() == 0 || strs[1].length() == 0) {
            return "";
        }
        
        for (int i = 0; i < Math.min(strs[0].length(), strs[1].length()); i++) {
            if(strs[0].charAt(i) != strs[1].charAt(i)) break;
            prefix +=  strs[0].charAt(i);
        }
        
        if(strs.length > 2) {
            for (int i = 2; i < strs.length; i++) {
                if(strs[i].length() == 0) {
                    return "";
                }
                for (int j = 0; j < Math.min(prefix.length(), strs[i].length()); j++) {
                    if(prefix.charAt(j) != strs[i].charAt(j)) {
                        prefix = prefix.substring(0, j);
                    }    
                }
                if(prefix.length() > strs[i].length()) {
                    prefix = prefix.substring(0, strs[i].length());
                }
            }
        }

        return prefix;
    }    
}
