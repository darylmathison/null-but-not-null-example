package nullbutnotnull;

import java.util.List;
import java.util.ArrayList;

public class StringValidator {
    private List<String> dirtyWords;
    
    public static final int ARRAY_SIZE = 20;
    public StringValidator() {
        dirtyWords = new ArrayList(ARRAY_SIZE);
    }
    
    public boolean isValid(String test) {
        boolean isValid = false;
        isValid = (test != null) && !test.isEmpty();
        if(isValid) {
            for(String word: dirtyWords) {
                if(word.equals(test)) {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }
    
    public void addDirtyWord(String word) {
        if(!isValidString(word)){
            throw new IllegalArgumentException(word + " is not a good dirty word");
        }
        
        dirtyWords.add(word);
    }
    
    private boolean isValidString(String test) {
        return ((test != null) && !test.isEmpty());
    }
}
