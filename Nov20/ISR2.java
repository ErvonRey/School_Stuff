package Nov20;

//import here:
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ISR2 {

    public static void main(String[] args) throws IOException{

        InputStreamReader cin = null;
        
        try {
            
            cin = new InputStreamReader(System.in);
            System.out.print("Enter a message (or 'quit' to exit): ");
            
            String input;
            
            do {
                
                input = new BufferedReader(cin).readLine();
                
                if (input != null) {
                    
                }
                
            } while (!input.equalsIgnoreCase("quit"));
            
            System.out.println("Exiting program...");
            
        } finally {
            
            if(cin != null) {
                cin.close();
            }
        }
        
        
    }

}
