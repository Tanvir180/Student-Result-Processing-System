
package Convertion;
public class PremitiveToString {
    public static void main(String[] args) {
        int i=100;
        double d=100.25;
        boolean b=true;
        String s1,s2,s3;
        s1=Integer.toString(i);
        s2=Double.toString(d);
        s3=Boolean.toString(b);
        System.out.println("S1= "+s1);
        System.out.println("S2= "+s2);
        System.out.println("S3= "+s3);
    }
}
