package ObjectsAndClasses.Exercise.P06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<People> peopleList = new ArrayList<>();
        while (!command.equals("End")) {

            String name = command.split(" ")[0];
            String ID = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);
            People people = new People(name, ID, age);
            peopleList.add(people);
            command = scanner.nextLine();
        }
        peopleList.sort(Comparator.comparing(People::getAge));
        for (People people : peopleList) {
            System.out.printf("%s with ID: %s is %d years old.%n", people.getName(), people.getID(), people.getAge());
        }
    }
}
