// Author: Monirul
// Date:   15/02/2020
// Class:  CSE2101
package assignment7;

public class Fraction {
    private int n,d; 
    public Fraction(int x, int y) 
    { 
         n=x;
         d=y;
    } 
    public void display(int i) 
    { 
          System.out.println("Fraction "+i+" is: "+n+"/"+d);
    } 
    public boolean isProper()
    { 
        if(n<d)
        {
            return true;
        }
        else
        {
            System.out.print(n+"/"+d+" ");
            return false;
        }
    } 
    public boolean isEquivalent(Fraction f) 
    {
        if((this.n/(double)this.d)==(f.n/(double)f.d))
                {
                    System.out.print(this.n+"/"+this.d+" and "+f.n+"/"+f.d);
                    return true;
                }
        else
            return false;
    }
}