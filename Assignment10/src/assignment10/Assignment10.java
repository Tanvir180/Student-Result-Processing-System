/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment10;
import java.io.*;
/**
 *
 * @author HP
 */
public class Assignment10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader in = null;
        FileWriter out = null;
        FileWriter out2 = null;
        FileWriter out3 = null;
        BufferedReader buffer = null;
        try
        {
            in = new FileReader("input.txt");
            buffer = new BufferedReader(in);
            out = new FileWriter("numbers.txt");
            out2 = new FileWriter("vowels.txt");
            out3 = new FileWriter("consonants.txt");
            String line;
            while ((line = buffer.readLine())!= null)
             {
                 int l=line.length();
                 for(int i=0;i<l;i++)
                 {
                    int a=line.charAt(i);
                    if(a>=48 && a<=57)
                    {
                        out.write((a-48)+", ");
                    }
                    else if(a>=65 && a<=90 || a>=97 && a<=122)
                    {
                      if(a==65||a==69||a==73||a==79||a==85||a==97||a==101||a==105||a==111||a==117)
                      {
                         out2.write((char)a+", ");
                      }
                      else
                      {
                         out3.write((char)a+", ");
                      }
                    }
                 }
             }
        }
        finally
            {
                if (in != null){ in.close();}
                if (out != null){out.close();}
                if (out2 != null){out2.close();}
                if (out3 != null){out3.close();}
            }
    }
}

