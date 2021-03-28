package Exercise;
import java.util.Scanner;
public class Taj4 
{
    public static void main(String[] args)
    {
        int row,col,i,j,x=0,y=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        row=input.nextInt();
        col=input.nextInt();
        double a[][] = new double[row][col];
        double max = 0.0;
        System.out.println("Enter the array: ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=input.nextDouble();
                if(max <a[i][j]) { max=a[i][j];x=i;y=j;}    
            }
        }
        System.out.println("The location of the largest element is at ("+x+","+y+")");
    }
}
