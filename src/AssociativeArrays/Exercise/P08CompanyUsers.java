package AssociativeArrays.Exercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        LinkedHashMap<String, ArrayList<String>> company = new LinkedHashMap<>();


        while (!command.equals("End")) {
            String[] commandParts = command.split(" -> ");
            String companyName = commandParts[0];
            String employeeId = commandParts[1];

            company.putIfAbsent(companyName, new ArrayList<>());
            if(company.containsKey(companyName) && !company.get(companyName).contains(employeeId)) {
                company.get(companyName).add(employeeId);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : company.entrySet()) {

            System.out.printf("%s%n", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {

                System.out.printf("-- %s%n", entry.getValue().get(i));
            }

        }

    }

}
