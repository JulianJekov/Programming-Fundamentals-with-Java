package List.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10_SoftuniCoursePlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String lessonTitle = command.split(":")[1];

            if (command.contains("Add")) {
               if(!schedule.contains(lessonTitle)){
                   schedule.add(lessonTitle);
               }
            } else if (command.contains("Insert")) {
                int index = Integer.parseInt(command.split(":")[2]);
                if(!schedule.contains(lessonTitle)){
                    schedule.add(index,lessonTitle);
                }
            } else if (command.contains("Remove")) {
                if(schedule.contains(lessonTitle)){
                    schedule.remove(lessonTitle);
                }
                String exercise = lessonTitle + "-Exercise";
                int indexOfLesson = schedule.indexOf(lessonTitle);
                if(schedule.get(indexOfLesson + 1).equals(exercise)){
                    schedule.remove(indexOfLesson + 1);
                }
            } else if (command.contains("Swap")) {
                String lessonTitle2 = command.split(":")[2];
                if(schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)) {
                    int indexLessonTitle = schedule.indexOf(lessonTitle);
                    int indexLessonTitle2 = schedule.indexOf(lessonTitle2);

                    schedule.set(indexLessonTitle, lessonTitle2);
                    schedule.set(indexLessonTitle2, lessonTitle);

                    String exercise = lessonTitle + "-Exercise";
                    String exercise2 = lessonTitle2 + "-Exercise";

                    if (schedule.contains(exercise)) {
                        schedule.remove(schedule.indexOf(exercise));
                        schedule.add(schedule.indexOf(lessonTitle) + 1 ,exercise);
                    }
                    if(schedule.contains(exercise2)){
                        schedule.remove(schedule.indexOf(exercise2));
                        schedule.add(schedule.indexOf(lessonTitle2) + 1 ,exercise2);
                    }
                }
            } else if (command.contains("Exercise")) {
                String exercise = lessonTitle + "-Exercise";
                int indexOfLesson = schedule.indexOf(lessonTitle);
                if(schedule.contains(lessonTitle)){
                    if(indexOfLesson == schedule.size() - 1){
                        schedule.add(indexOfLesson + 1,exercise);
                    }else if(indexOfLesson < schedule.size() - 1 && !schedule.contains(exercise)){
                        schedule.add(indexOfLesson + 1,exercise);
                    }
                }else{
                    schedule.add(lessonTitle);
                    schedule.add(exercise);
                }
            }
            command = scanner.nextLine();
        }
        int index = 1;
        for (String lesson : schedule){
            System.out.println(index + "." + lesson);
            index++;
        }
    }
}