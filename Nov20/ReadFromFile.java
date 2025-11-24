package Nov20;

//import here:
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args){
        
        
    

    }
    
    public static void readFromFile(String fileName){
        
        try {
            
            File obj = new File(fileName);
            
            Scanner scanning = new Scanner(obj);
            
            while (scanning.hasNextLine()) {
                String data = scanning.nextLine();
                System.out.println(data);
            }
            
            scanning.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
        
    }

}
