// 412. Fizz Buzz
// https://leetcode.com/problems/fizz-buzz/

import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    public List<String> solution(int n) {
        List<String> output = new ArrayList<String>();
        // for-loop that loops n-times
        // if n is divisible by 3 and 5 add FizzBuzz to list.
        // if n is divisible by 3, add Fizz to list.
        // if n is divisible by 5, add Buzz to list.
        // if none of the above apply, add the number itself to list
        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                output.add("FizzBuzz");
            }
            else if(i % 3 == 0) {
                output.add("Fizz");
            }
            else if(i % 5 == 0) {
                output.add("Buzz");
            }
            else {
                output.add(Integer.toString(i));
            }    
        }
        return output;
    }   
}