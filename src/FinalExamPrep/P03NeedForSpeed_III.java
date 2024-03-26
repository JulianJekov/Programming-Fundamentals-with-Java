package FinalExamPrep;

import java.util.*;

public class P03NeedForSpeed_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] carsData = scanner.nextLine().split("\\|");
            cars.put(carsData[0], new ArrayList<>());
            cars.get(carsData[0]).add(Integer.parseInt(carsData[1]));
            cars.get(carsData[0]).add(Integer.parseInt(carsData[2]));
        }
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] inputData = input.split(" : ");

            switch (inputData[0]) {
                case "Drive": {
                    String car = inputData[1];
                    int distance = Integer.parseInt(inputData[2]);
                    int fuel = Integer.parseInt(inputData[3]);
                    if (cars.get(car).get(1) < fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        cars.get(car).set(0, cars.get(car).get(0) + distance);
                        cars.get(car).set(1, cars.get(car).get(1) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, fuel);
                    }
                    if (cars.get(car).get(0) >= 100000) {
                        cars.remove(car);
                        System.out.printf("Time to sell the %s!%n", car);
                    }
                }
                break;
                case "Refuel": {
                    String car = inputData[1];
                    int fuel = Integer.parseInt(inputData[2]);
                    if (fuel + cars.get(car).get(1) > 75) {
                        fuel = 75 - cars.get(car).get(1);
                    }
                    cars.get(car).set(1, cars.get(car).get(1) + fuel);
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                }
                    break;
                case "Revert":
                    String car = inputData[1];
                    int kilometers = Integer.parseInt(inputData[2]);
                    if(cars.get(car).get(0) - kilometers < 10000){
                        cars.get(car).set(0,10000);
                    }else{
                        cars.get(car).set(0,cars.get(car).get(0) - kilometers);
                        System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometers);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : cars.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n"
                    ,entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }

    }
}
