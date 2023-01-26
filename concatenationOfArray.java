// 1929. Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/

public class concatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];    
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i + nums.length] = nums[i];    
        }
        
        return ans;
    }    
}
