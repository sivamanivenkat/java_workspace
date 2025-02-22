import java.io.*;

public class BufferedExample {
    public static void main(String[] args) {
        String fileName;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Buffered.txt"))) {
            bw.write("I am writing this using Buffered Writer!!!\n");
//            bw.newLine();
            bw.write("It is one more way to write into a file.");
            System.out.println("File 'Buffered.txt' written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the file name: ");
            fileName = bufferedReader.readLine();

            // Read file content
            try (BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"))) {
                String line;
                System.out.println("Reading file: " + fileName + ".txt");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
