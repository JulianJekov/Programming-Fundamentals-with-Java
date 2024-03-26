package FinalExamPrep;

import java.util.Scanner;

public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder sbStops = new StringBuilder(stops);

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] commands = input.split(":");
            String[] command = commands[0].split("\\s+");

            switch (command[0]) {
                case "Add": {
                    int index = Integer.parseInt(commands[1]);
                    String stop = commands[2];
                    if (index >= 0 && index <= stops.length()) {
                        String firstSide = stops.substring(0, index);
                        String secondPart = stops.substring(index);
                        stops = firstSide.concat(stop).concat(secondPart);
                        // sbStops.insert(index, stop);
                    }
                }
                break;
                case "Remove": {
                    int startIndex = Integer.parseInt(commands[1]);
                    int endIndex = Integer.parseInt(commands[2]);
                    if (startIndex >= 0 && startIndex < stops.length() && endIndex >= 0 && endIndex < stops.length()) {
                        String firstSide = stops.substring(0, startIndex);
                        String secondSide = stops.substring(endIndex + 1);
                        stops = firstSide.concat(secondSide);
                        //sbStops.delete(startIndex, endIndex + 1);
                    }
                }
                break;
                case "Switch":
                    String oldStop = commands[1];
                    String newStop = commands[2];

                    if (stops.contains(oldStop)) {
                        stops = stops.replaceAll(oldStop, newStop);
                    }
//                    if(sbStops.indexOf(oldStop) != -1){
//                        sbStops.replace(sbStops.indexOf(oldStop), sbStops.indexOf(oldStop) + oldStop.length(),newStop);
//                    }
                    break;

            }
            System.out.println(stops);
            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", stops);

    }
}
