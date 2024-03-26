package RegularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] demons = scanner.nextLine().split(",");

        for (int i = 0; i < demons.length; i++) {

            String demon = demons[i].replaceAll(" ", "");


            Pattern pattern = Pattern.compile("(?<health>[^0-9+\\-*\\/.])(?<dmg>\\-?\\d+\\.?\\d*)");
            Matcher matcher = pattern.matcher(demon);
            int health = 0;
            double damage = 0;
            while (matcher.find()) {
                health+= Integer.parseInt(matcher.group("health"));
                damage += Double.parseDouble(matcher.group());
            }

            String regexDamage = "-?\\d+\\.?\\d*";
            Pattern patternDamage = Pattern.compile(regexDamage);
            Matcher matcherDamage = patternDamage.matcher(demon);



            while (matcherDamage.find()) {
                damage += Double.parseDouble(matcherDamage.group());
            }
            String regexDivideOrMultiply = "[*/]";
            Pattern patternDivideOrMultiply = Pattern.compile(regexDivideOrMultiply);
            Matcher matcherDivideOrMultiply = patternDivideOrMultiply.matcher(demon);

            while (matcherDivideOrMultiply.find()){

                if(matcherDivideOrMultiply.group().equals("*")){
                    damage = damage * 2;
                }else{
                    damage = damage / 2;
                }
            }
            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);
        }
    }
}