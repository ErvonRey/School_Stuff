package Nov20;


import java.io.File;

public class deleteFile {

    public static void main(String[] args){
        
        deleteFile("writeOnMe.txt");
        
    }
    
    public static void deleteFile(String fileName){
        
        File name = new File(fileName);
        
        if (name.exists()) {
            
            if (name.delete()) {
                System.out.println("Successfully deleted the file: " + fileName);
            } else {
                System.out.println("Error on file deletion");
            }
            
        } else {
            System.out.println("File does not exist.");
        }
        
    }


}
