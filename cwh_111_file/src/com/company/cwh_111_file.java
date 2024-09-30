package  com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class cwh_111_file {
    public static void main(String[] args) {
        // code to create a new file
        /*
     File myFile = new File("cwh11file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
             */
       // Code to write a file 
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this java course");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        

    }
}
