package ObjectsAndClasses.Exercise.P04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String data = scanner.nextLine();
            String firstName = data.split("\\s+")[0];
            String lastName = data.split("\\s+")[1];
            double grade = Double.parseDouble(data.split("\\s+")[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList) {

//            System.out.println(student.getFirstName() + " "
//                    + student.getLastName() + ": "
//                    + student.getGrade());
            System.out.printf("%s %s: %.2f%n",student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
