
package Class;

import java.util.Scanner;
class Rectangle
{
    double leng,wid;
    void getdata(double x,double y)
    {
        leng=x;
        wid=y;
    }
    void area()
    {
        double area=leng*wid;
       // return area;
        System.out.println("rec area is "+area);
    }
    void perm()
    {
        double per=2*(leng+wid);
       // return per;
        System.out.println("rec perm is "+per);
    }
}
class Circle
{
    double radi;
    double pie=3.1416;
    void getdata(double z)
    {
        radi=z;
        
    }
    void cirarea()
    {
        double area=pie*radi*radi;
        //return area;
        System.out.println("circle area is"+area);
    }
    void circumterence()
    {
        double circ=2*pie*radi;
       // return circ;
        System.out.println(" circle ciec is "+circ);
    }
}
public class ClassCreate {

   
    public static void main(String[] args) {
      
        double a,b,c,d;
                int n;
        Rectangle rect=new Rectangle(); //obj creation
        Circle cir= new Circle();//obj creation
        rect.getdata(20,30);
       // a=rect.area();
       // b=rect.perm();
        cir.getdata(3);
       // c=cir.cirarea();
       // d=cir.circumterence();
        System.out.println("Enter a number:");
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        if(n==1)
           // System.out.println("rect area"+a);
            rect.area();
        if(n==2)
           // System.out.println("rect perm"+b);
            rect.perm();
        if(n==3)
           // System.out.println("circle area"+c);
            cir.cirarea();
        if(n==4)
            //System.out.println("rect area"+d);
        cir.circumterence();
        
    }
    
}

