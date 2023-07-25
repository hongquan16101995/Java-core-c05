package codegym.day_16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOObject {
    public static void main(String[] args) {
        List<Student> students = read();

        if (students.isEmpty()) {
            System.out.println("Not exist!");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();

        Student student1 = new Student(1, name, age, gender);
        students.add(student1);

        write(students);
    }

    public static void write(List<Student> students) {
        try {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\Java-core-c05\\test\\product.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Student student : students) {
                String value = student.getId() + "-"
                        + student.getName() + "-"
                        + student.getAge() + "-"
                        + student.getGender() + "\n";
                bufferedWriter.write(value);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> read() {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\Java-core-c05\\test\\product.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split("-");
                Student student = new Student(
                        Integer.parseInt(strings[0]),
                        strings[1],
                        Integer.parseInt(strings[2]),
                        strings[3]);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}

class Student implements Serializable{
    private static final long serialUID = 123455675;
    private int id;
    private String name;
    private int age;
    private String gender;

    public Student(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
