import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {

    public Read(ArrayList<String> words) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Dictionary.txt"));
        try {
            String line = reader.readLine();
            while (line != null){
                words.add(line);

                line = reader.readLine();

            }
        } finally {
            reader.close();
        }

    }


}
