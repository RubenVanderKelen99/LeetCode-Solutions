public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // create array of characters from magazine
        // loop through the ransomNote letters and check if each letter is in magazine array
        // if true => remove letter (firstindexof?) from array and continue, if true for all => return true
        // if false => return false

        /*for (char c : ransomNote.toCharArray()) {
            if(magazine.contains(String.valueOf(c))) {
                magazine = magazine.replaceFirst(String.valueOf(c), "");
            }
            else {
                return false;
            }
        }*/

        //loop through string and get index of instead of charachters?
        for (int i = 0; i < ransomNote.length(); i++) {
            if(magazine.contains(ransomNote.substring(i, i + 1))) {
                magazine = magazine.replaceFirst(ransomNote.substring(i, i + 1), "");
            }
            else {
                return false;
            }            
        }

        return true;

        // Alternative solution
        // check two maps against eachother for duplicates
        // create new map from duplicates
        // if resultingMap = ransomNoteMap return true
        // else return false
            
    }    
}
