package codegym.day_16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ADMIN\\Desktop\\Java-core-c05\\test\\demo.txt");

//        write(file);
//        read(file);

        readBuffer(file);
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
            fileWriter.write("HelloWorld");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readBuffer(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String a;
        while ((a = bufferedReader.readLine()) != null) {
            System.out.println(a);
        }
    }

    public static void writeBuffer(File file) {
        try (FileWriter fileWriter = new FileWriter(file,true)) {
            fileWriter.write("HelloWorld");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
