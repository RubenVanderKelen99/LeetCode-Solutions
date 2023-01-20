public class numberOfSteps {
    public int getSteps(int num) {
        // If the number is even divide by 2 and count a step
        // If the number is odd subtract 1 and count a step
        // Count steps untill the number is 0 and return the steps count
        int steps = 0;
        while (num > 0) {
            steps++;
            switch (num % 2) {
                case 0:
                    num = num / 2;
                    break;
                default:
                    num -= 1;
                    break;
            }
        }
        return steps;    
    }    
}
