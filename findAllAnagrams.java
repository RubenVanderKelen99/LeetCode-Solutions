import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 438. Find All Anagrams in a String
//https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class findAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        int len_s = s.length();
        int len_p = p.length();
    
        if(len_s < len_p) return new ArrayList<>();
        
        int[] p_freq = new int[26];
        int[] window = new int[26];

        for(int i=0;i<len_p;i++){
            p_freq[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }
        
        List<Integer> answer = new ArrayList<>();

        if(Arrays.equals(p_freq, window)) answer.add(0);
        
        for(int i=len_p;i<len_s;i++){
            window[s.charAt(i-len_p) - 'a']--;
            window[s.charAt(i) - 'a']++;
            if(Arrays.equals(p_freq, window)) answer.add(i-len_p+1);
        }
        return answer;
    }
}
