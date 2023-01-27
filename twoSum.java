// 1. Two Sum
// https://leetcode.com/problems/two-sum/
public class twoSum {
    public int[] getTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }   
            }
        }
        
        return null;
    }   
}
