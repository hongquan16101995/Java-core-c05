package codegym.day_16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainBinary {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "chien", 20, "male"));
        students.add(new Student(2, "tuyen", 24, "male"));
        students.add(new Student(3, "hoan", 22, "male"));
        students.add(new Student(4, "oanh", 17, "female"));
        write(students);
        for (Student student : students) {
            System.out.println(student);
        }

        List<Student> studentList = read();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void write(List<Student> students) {
        try {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\Java-core-c05\\test\\student_binary");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> read() {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\Java-core-c05\\test\\student_binary");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            students = (List<Student>) object;
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            e.printStackTrace();
        }
        return students;
    }
}
