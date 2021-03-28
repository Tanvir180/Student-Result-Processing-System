package Exception;

public class Exp1 {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result = " + result);
            /*  int [] a;
            a = new int [5];
            a[4]=50;
             */

        } catch (ArithmeticException e2) {
            System.out.println("Exception is :" + e2);
        } /*  
         catch(ArrayIndexOutOfBoundsException e3)
        {
            System.out.println("Exception is :"+e3);
        }
         */ catch (Exception e1) {
            System.out.println("Exception is :" + e1);
        } finally {
            System.out.println("Code End");
        }

    }

}
