
package labexam;
import java.io.PrintStream;
import static java.lang.Math.acos;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner input=new Scanner (System.in);
    double r;
	double sarea;
	double carea;
	double area;
	int t;
           t=input.nextInt();
       for (int i = 1; i <= t; i++)
       {
           r=input.nextDouble();
           carea = 2 * acos(0.0) * r * r;
		sarea = (2 * r) * (2 * r);
		area = sarea - carea;
                
        
         PrintStream printf = System.out.printf("Case %d: %.2f\n",i,area);
       }
   
  
    }
  
}