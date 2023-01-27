// 472. Concatenated Words
// https://leetcode.com/problems/concatenated-words/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class concatenatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> Dict = new ArrayList<String>();

        /* OLD
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            if(word.length() < minLength) minLength = word.length();
            Dict.add(word);    
        }*/

        HashMap<Character, HashMap> wordHashMap = new HashMap<>();
        HashMap<Character, HashMap> currentHashMap;
        for (String word : words) {
            if(word.length() == 1) {
                wordHashMap.putIfAbsent(word.charAt(0), new HashMap<Character, String>(){{put(word.charAt(0), word);}});
            }
    
            wordHashMap.putIfAbsent(word.charAt(0), new HashMap<>());
            currentHashMap = wordHashMap.get(word.charAt(0));
    
            for (int i = 1; i < word.length() - 1; i++) {
                currentHashMap.putIfAbsent(word.charAt(i), new HashMap<>());
                currentHashMap = currentHashMap.get(word.charAt(i));   
            }
            System.out.println(word.charAt(word.length() - 2));
            //currentHashMap = currentHashMap.get(word.charAt(word.length() - 2));
            currentHashMap.put(word.charAt(word.length() - 1), new HashMap<String, String>(){{put("values", word);}});
        }
        System.out.println(wordHashMap);
        return Dict;

    }
    
    private HashMap<Character, HashMap> createHashMap(String word){
        HashMap<Character, HashMap> wordHashMap = new HashMap<>();
        HashMap<Character, HashMap> currentHashMap;
        if(word.length() == 1) {
            wordHashMap.putIfAbsent(word.charAt(0), new HashMap<Character, String>(){{put(word.charAt(0), word);}});
        }

        wordHashMap.putIfAbsent(word.charAt(0), new HashMap<>());
        currentHashMap = wordHashMap.get(word.charAt(0));

        for (int i = 1; i < word.length() - 1; i++) {
            currentHashMap.put(word.charAt(i), new HashMap<>());
            currentHashMap = currentHashMap.get(word.charAt(i));   
        }

        System.out.println(word.charAt(word.length() - 2));
        //currentHashMap = currentHashMap.get(word.charAt(word.length() - 2));
        currentHashMap.put(word.charAt(word.length() - 1), new HashMap<String, String>(){{put("values", word);}});

        return wordHashMap;
    }
}
