package _06_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_Students {
    static class Students {
        String firstName;
        String lastName;
        String age;
        String town;

        public Students(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Students> studentsList = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] students = command.split(" ");
            String firstName = students[0];
            String lastName = students[1];
            String age = students[2];
            String town = students[3];

            Students currentStudent = new Students(firstName, lastName, age, town);
            studentsList.add(currentStudent);
            command = scanner.nextLine();
        }

        String townName = scanner.nextLine();
        for (Students student : studentsList) {
            if (student.getTown().equals(townName)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
