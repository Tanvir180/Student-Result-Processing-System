package contest1;
import java.util.Scanner;
public class Contest1 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        char[] ch = new char[100];
        char[] give = {'a','e','i','o','u','y'};
        String s1 = input.next().toLowerCase().replaceAll("[aeiouyAEIOUY]", "");
        StringBuilder input1 = new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            input1.append(".");
            input1.append(s1.charAt(i));
        }
        System.out.println(input1);
    } 
}

