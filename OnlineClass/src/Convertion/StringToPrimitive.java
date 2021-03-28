
package Convertion;
public class StringToPrimitive {
    public static void main(String[] args) {
        String s1,s2,s3;
        s1="100";
        s2="100.24";
        int i;
        i=Integer.parseInt(s1);
        System.out.println("i = "+i);
        double d;
        d=Double.parseDouble(s2);
        System.out.println("d = "+d);
        //Another way of conversion
        s3="200";
        int x;
        x=Integer.valueOf(s3);
        System.out.println("x = "+x);
        
    }
}
