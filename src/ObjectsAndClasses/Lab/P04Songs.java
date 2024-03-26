package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    static class Song{
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time){
         this.typeList = typeList;
         this.name = name;
         this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 1; i <= numberOfSongs ; i++) {
            String[] songsData = scanner.nextLine().split("_");
            String typeListInput = songsData[0];
            String nameInput = songsData[1];
            String timeInput = songsData[2];

            Song currentSong = new Song(typeListInput, nameInput,timeInput);
            songList.add(currentSong);
        }
        String command = scanner.nextLine();

        if(command.equals("all")){

            for (Song items : songList){
                System.out.println(items.getName());
            }
        }else{
            for (Song items : songList){
                if(items.getTypeList().equals(command)){
                    System.out.println(items.getName());
                }
            }
        }
    }
}
