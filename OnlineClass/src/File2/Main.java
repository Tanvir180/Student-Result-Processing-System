
package File2;

import java.io.File;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String id,name;
        //Directory create
        File dir = new File("C:/Users/My AsUs/Documents/NetBeansProjects/OnlineClass/Person");
           dir.mkdir(); 
           String path=dir.getAbsolutePath();
           //dir.delete();
           File file1= new File(path+"/Student.txt");
           try
           {
               //File create
               file1.createNewFile();
               //file1.exists();
               //file1.delete()
            try ( 
                    //Write into file
                    Formatter formatter = new Formatter("C:/Users/My AsUs/Documents/NetBeansProjects/OnlineClass/Person/Student.txt")) {
                Scanner input = new Scanner(System.in);
                System.out.println("How Many Students :");
                int num= input.nextInt();
                for(int i=0;i<num;i++)
                {
                    System.out.println("Enter student id and name :");
                    id=input.next();
                    name=input.next();
                    formatter.format("%s %s \r\n",id,name);
                }
                formatter.close();
                // Read from file
                File file = new File("C:/Users/My AsUs/Documents/NetBeansProjects/OnlineClass/Person/Student.txt");
                   try (Scanner scanner = new Scanner (file)) {
                       while(scanner.hasNext())
                       {
                           String id1 =scanner.next();
                           String name1 = scanner.next();
                           System.out.println("ID : "+id1+"  Name :"+name1);
                       }  }
            }
           }catch(IOException e)
           {
               System.out.println(e);
           }
    }
    
}
