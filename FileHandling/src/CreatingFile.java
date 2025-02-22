import java.io.File;
import java.io.IOException;

public class CreatingFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Venkat.txt");

        if(file.createNewFile()){
            System.out.println(file.getName());
        }
        else{
            System.out.println("Cannot create File");
        }
    }
}
