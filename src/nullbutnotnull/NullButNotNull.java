package nullbutnotnull;

public class NullButNotNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String trouble = "fine";
        StringValidator validator = new StringValidator();
        validator.addDirtyWord("null");
        
        if(trouble != null && !trouble.isEmpty() && !trouble.equals("null")) {
            System.out.println("fine here");
        } 
        
        if(isValidString(trouble)) {
           System.out.println("fine here");
        } else {
            System.out.println("not so fine here");
        }
        
        if(validator.isValid(trouble)) {
           System.out.println("fine here");
        } else {
            System.out.println("not so fine here");
        }
    }
    
    private static boolean isValidString(String test) {
        boolean isValid = (test != null && !test.isEmpty() && !test.equals("null"));
        return isValid;
    }
    
}
