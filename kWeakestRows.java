import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class kWeakestRows {
    public int[] output(int[][] mat, int k) {
        // Loop through each row
        // Continue till a 0 has been found
        // The index of that 0 value equals the strength of that row (counting from 0)
        // Save the strength together with the row
        ArrayList<Integer[]> strenghList = new ArrayList<>();
        int index, currRow;
        currRow = 0;
        for (int[] row : mat) {
            index = 0;
            if(row[row.length - 1] == 1) {
                index = row.length;
            }
            else{
                while (row[index] == 1) {
                    index++;
                }    
            }
            strenghList.add(new Integer[]{currRow, index});
            currRow++;
        }

        Collections.sort(strenghList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] z1, Integer[] z2) {
                if (z1[1] > z2[1])
                    return 1;
                if (z1[1] < z2[1])
                    return -1;
                return 0;
            }
        });

        //System.out.println(strenghList.subList(0, k).get(2)[0]);

        int[] output = new int[k];
        while(k > 0) {
            k--;
            output[k] = strenghList.get(k)[0];
        }
        return output;
    }
}