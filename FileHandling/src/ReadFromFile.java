import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException{

        FileReader fileReader = null;
        try{
            fileReader = new FileReader("Venkat.txt");
            Scanner sc = new Scanner(fileReader);

//            while(sc.hasNextLine()) {
//                String str = sc.nextLine();
//                System.out.println(str);
//            }

            int Character = 0;
            while ((Character = fileReader.read()) != -1){
                System.out.print((char)Character);
            }

        }catch (IOException e){
            System.out.println("Cannot read from file : " + e);
        }
        finally {
            if(fileReader != null){
                fileReader.close();
            }
        }
    }
}
