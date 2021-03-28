package File1;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader in;
        FileWriter out;
        BufferedReader buffer;
        in = new FileReader("Input.txt");
        out = new FileWriter("Output.txt");
        buffer = new BufferedReader(in);
        String line;
        while((line = buffer.readLine()) != null)
        {
            out.write(line+"\n");
        }
        out.close();
    }
}
