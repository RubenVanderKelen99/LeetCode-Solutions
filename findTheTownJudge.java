// 997. Find the Town Judge
// https://leetcode.com/problems/find-the-town-judge/
public class findTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        // if everybody trusts somebody then there is no town judge
        // return -1
        if (n == trust.length) {
            return -1;
        }

        // if there is only one person that trusts nobody he is the town judge
        // return 1
        if (trust[0].length == 0) {
            return 1;
        }

        // get array of # trusted & # trustee
        // if a person has been a trustee 0 times and been trusted n - 1 times he is the townjudge
        // return i + 1
        int counterTrusted[] = new int[n];
        int counterTrustee[] = new int[n];
        for (int i = 0; i < trust.length; i++) {
            counterTrustee[trust[i][0] - 1]++;
            counterTrusted[trust[i][1] - 1]++;    
        }

        for (int i = 0; i < counterTrustee.length; i++) {
            if(counterTrustee[i] == 0){
                if(counterTrusted[i] == (n - 1)) {
                    return i + 1;
                }             
            }
        }  

        return -1;
    }
}
