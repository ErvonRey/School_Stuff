package Nov20;

//import here:
import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args){
        
        createFile("output.txt");

    }
    
    public static void createFile(String name){
        
        try {
            
            File obj = new File(name);
            
            if (obj.createNewFile()){
                
                System.out.println("File has been created! Name: " + obj.getName());
                System.out.println("Location of file: " + obj.getPath());
                
            } else {
                
                System.out.println("Error: File already exists.");
                
            }
            
        } catch (IOException e) {
            
            System.out.println("An error has occured.");
            e.printStackTrace();
            
        }
        
    }

}
