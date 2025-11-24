package Nov20;

//import here:

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class ISR3 {

    public static void main(String[] args) throws IOException{
        
//        CreateFile file = new CreateFile();
//        file.createFile("input.txt");
//        file.createFile("output.txt");

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
    
        String line;
        
        while((line = reader.readLine()) != null) {
            
            if (line.equalsIgnoreCase("end")) {
                break;
            }
            
            writer.write(line);
            writer.newLine();
            
        }
        
        reader.close();
        writer.close();

        deleteFile.deleteFile("mytextfile.txt");
        
    }

}
