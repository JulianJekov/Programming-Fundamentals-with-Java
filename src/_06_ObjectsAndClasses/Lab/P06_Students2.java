package _06_ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_Students2 {
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
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] students = input.split(" ");
            String firstName = students[0];
            String lastName = students[1];
            String age = students[2];
            String town = students[3];

            Students currentStudent = new Students(firstName, lastName, age, town);
            if (isStudentExisting(studentsList, firstName, lastName)) {
                int index = getIndex(studentsList, firstName, lastName);
                studentsList.set(index, currentStudent);
            } else {
                studentsList.add(currentStudent);
            }

            input = scanner.nextLine();
        }
        String townName = scanner.nextLine();
        for (Students student : studentsList) {
            if (student.getTown().equals(townName)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    static boolean isStudentExisting(List<Students> studentList, String firstName, String lastName) {
        for (Students student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndex(List<Students> studentsList, String firstName, String lastName) {
        int index = -1;
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getFirstName().equals(firstName) && studentsList.get(i).getLastName().equals(lastName)) {
                index = i;

            }
        }
        return index;
    }
}