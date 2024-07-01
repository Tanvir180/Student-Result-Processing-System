// Name: MD. Tanvir Ahammed Hridoy
//Id: B180305020
// Email: hmhridoy65@gmail.com
package Assignment11;
import java.util.*;
public class Assignment11{
    
    static void printStars(int a)
    {
        if(a==0) return;
            System.out.print("*");
            printStars(a-1);
    }
    
    static void printStripes(int a)
    {
        if(a==0) return;
            System.out.print("-");
            printStripes(a-1);
    }
    
    static void printPatn(int a, int line)
    {
        if(line<0) return;
        printStars(a-line);
        printStripes(line);
        System.out.println();
        printPatn(a,line-1);
    }
    

    static int convertNumb(int arr[], int i,int l,int x)
    {
        if(i==l) return x;
        x=(10*x)+arr[i];
        return convertNumb(arr,i+1,l,x);
    }
    
    
    static ArrayList ArrayIntersection(ArrayList AL1,ArrayList AL2,ArrayList intersect,int m,int p)
    {
        if(p>=m) return intersect;
        boolean s = AL2.contains(AL1.get(p));
        if(s)
        {
           intersect.add(AL1.get(p));
        }
        return ArrayIntersection(AL1,AL2,intersect,m,p+1);
    }
    
    
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int m,n,i,num,x,y;
        String s;
        
        
        System.out.print("Enter a number to print the pattern: ");
        n = in.nextInt();
        printPatn(n,n);

        System.out.println("Enter an array of digits(0-9) for converting a number");
        System.out.print("Size of the array: ");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for(i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        num = convertNumb(arr,0,n,0);
        System.out.println("Converted number is : "+num);
        
       
        ArrayList A1 = new ArrayList();
        ArrayList A2 = new ArrayList();
        System.out.println("Enter two arraylist for intersection");
        
        System.out.print("1st arraylist Size: ");
        x=in.nextInt();
        System.out.print("Enter the elements: ");
        for(i=1;i<=x;i++)
        {
            s=in.next();
            A1.add(s);
        }
        
        System.out.print(" 2nd arraylist Size: ");
        y=in.nextInt();
        System.out.print("Enter the elements: ");
        for(i=1;i<=y;i++)
        {
            s=in.next();
            A2.add(s);
        }
        
        if(x<=y) m=x;
        else m=y;
        ArrayList AL3 = new ArrayList();
        ArrayList intersect = ArrayIntersection(A1,A2,AL3,m,0);
        System.out.println(A1 + " intersect " + A2 + " = " + intersect);
    
    }
    
}
