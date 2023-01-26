public class richestCostumerWealth {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int[] account : accounts) {
            int totalWealth = 0;
            for (int i = 0; i < account.length; i++) {
                totalWealth += account[i];   
            }
            if (totalWealth > maximumWealth) {
                maximumWealth = totalWealth;
            }    
        }

        return maximumWealth;
    }    
}
