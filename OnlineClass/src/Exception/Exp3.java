package Exception;
public class Exp3 {
    public static void main(String[] args) {
        try{
            throw new buildException("This is my exception.");
        }catch(buildException e){
            System.out.println(e);
        }
    }
    
}
