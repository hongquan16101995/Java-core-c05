package codegym.day_16;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\abc.txt");

        write(file);
        read(file);
    }

    public static void read(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        int a;
        while ((a = fileReader.read()) != -1) {
            System.out.print((char) a);
        }
    }

    public static void write(File file) {
        try (FileWriter fileWriter = new FileWriter(file,true)) {
            fileWriter.write("\nHelloWorld");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
