
package Exception;


public class buildException extends Exception {
    String str1;
    buildException(String str2) {
        this.str1= str2;
    }
    @Override
    public String toString(){
        return(str1);
    }
    
}`  
