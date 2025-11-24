package Nov20;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args){

        writeOnFile("mytextfile.txt", "test");

    }
    
    public static void writeOnFile(String fileName, String message){
        
        try {
            
            FileWriter writer = new FileWriter(fileName);
            writer.write(message);
            writer.close();
            
            System.out.println("Success on writing on file: " + fileName);
            
        } catch (IOException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        
    }

}
