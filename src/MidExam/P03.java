package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phones = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String commandName = command.split(" - ")[0];
            String phone = command.split(" - ")[1];
            switch (commandName) {
                case "Add":

                    if (!phones.contains(phone)) {
                        phones.add(phone);
                    }
                    break;
                case "Remove":
                    phones.remove(phone);
                    break;
                case "Bonus phone":
                    String oldPhone = phone.split(":")[0];
                    String newPhone = phone.split(":")[1];
                    if (phones.contains(oldPhone)) {
                        int indexOldPhone = phones.indexOf(oldPhone);
                        phones.add(indexOldPhone + 1, newPhone);
                    }
                    break;
                case "Last":
                    if (phones.contains(phone)) {
                        String lastPhone = phones.get(phones.indexOf(phone));
                        phones.remove(phone);
                        phones.add(lastPhone);

                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", phones));
    }
}
