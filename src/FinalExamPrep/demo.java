package FinalExamPrep;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] commands = input.split(":");

            switch (commands[0]) {
                case "Add Stop": {
                    int index = Integer.parseInt(commands[1]);
                    String stop = commands[2];
                    if (index >= 0 && index <= stops.length()) {
                        stops.insert(index, stop);
                    }
                }
                break;
                case "Remove Stop": {
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    if (startIndex >= 0 && startIndex < stops.length() && endIndex >= 0 && endIndex < stops.length()) {
                      stops.delete(startIndex, endIndex + 1);
                    }
                }
                break;
                case "Switch":
                    String oldStop = commands[1];
                    String newStop = commands[2];
                    if(stops.toString().contains(oldStop)){
                        String updatedStops = stops.toString().replace(oldStop,newStop);
                        stops = new StringBuilder(updatedStops);
                    }
//                    if(stops.indexOf(oldStop) != -1){
//                        stops.replace(stops.indexOf(oldStop), stops.indexOf(oldStop) + oldStop.length(),newStop);
//                    }
                    break;
            }
            System.out.println(stops);
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}