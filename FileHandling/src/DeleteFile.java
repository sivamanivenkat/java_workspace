import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("example.txt");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println("File created Successfully!");

        if(file.exists()){
            System.out.println(file.getName());
        }

        if(file.delete()){
            System.out.println("Deleted Succesfully");
        }
        else{
            System.out.println("Not able to delete file");
        }
    }
}
