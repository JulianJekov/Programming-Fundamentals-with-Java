package FinalExam;

import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> message = new LinkedHashMap<>();
        String commands = scanner.nextLine();

        while (!commands.equals("Statistics")){
            String[] commandData = commands.split("=");

            switch (commandData[0]){

                case"Add":
                    String username = commandData[1];
                    int sent = Integer.parseInt(commandData[2]);
                    int received = Integer.parseInt(commandData[3]);
                    if(!message.containsKey(username)){
                        message.put(username, new ArrayList<>());
                        message.get(username).add(sent);
                        message.get(username).add(received);
                    }else{
                        commands = scanner.nextLine();
                        continue;
                    }
                    break;
                case"Message":
                    String sender = commandData[1];
                    String receiver = commandData[2];
                    if(message.containsKey(sender) && message.containsKey(receiver)){
                        message.get(sender).set(0,message.get(sender).get(0) + 1);
                        message.get(receiver).set(1,message.get(receiver).get(1) + 1);
                    }else{
                        break;
                    }
                    if(message.get(sender).get(0) + message.get(sender).get(1) >= capacity){
                        message.remove(sender);
                        System.out.println(sender + " reached the capacity!");
                    }
                    if(message.get(receiver).get(0) + message.get(receiver).get(1) >= capacity){
                        message.remove(receiver);
                        System.out.println(receiver + " reached the capacity!");
                    }
                    break;
                case"Empty":
                    String username2 = commandData[1];
                    if(username2.equals("All")){
                       message.clear();
                       break;
                    }
                    message.remove(username2);
                    break;

            }
            commands = scanner.nextLine();
        }
        if(!message.isEmpty()) {
            System.out.println("Users count: " + message.size());

            for (Map.Entry<String, List<Integer>> entry : message.entrySet()) {
                System.out.printf("%s - %d%n", entry.getKey(), entry.getValue().get(0) + entry.getValue().get(1));
            }
        }
    }
}