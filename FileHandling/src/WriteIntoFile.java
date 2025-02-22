import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("Venkat.txt");
            fileWriter.write("Hii, I am Venkat!!\n");
            fileWriter.write("I am writing to a File with name Venkat.");

            fileWriter.close();

            System.out.println("Successfully written to File Venkat.txt");
        }catch (IOException e){
            System.out.println("File Not Found :" + e);
        }
    }
}
