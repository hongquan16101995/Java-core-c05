package codegym.day_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("chien", 20, 1500));
        studentList.add(new Student("phu", 19, 15000));
        studentList.add(new Student("hoan", 22, 1000));
        studentList.add(new Student("tuyen", 25, 1000));
        studentList.add(new Student("oanh", 20, 1000));
        studentList.add(new Student("quang anh", 20, 15000));

//        //triển khai vs comparator
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getAge() == o2.getAge()) {
//                    return (int)(o1.getMoney() - o2.getMoney());
//                }
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.getMoney() - o2.getMoney());
//            }
//        });

        Collections.sort(studentList);

        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
