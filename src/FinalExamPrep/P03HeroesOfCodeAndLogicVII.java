package FinalExamPrep;

import java.util.*;

public class P03HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> heroes = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] heroData = scanner.nextLine().split(" ");
            String heroName = heroData[0];
            int HP = Integer.parseInt(heroData[1]);
            int MP = Integer.parseInt(heroData[2]);

            heroes.put(heroName, new ArrayList<>());
            heroes.get(heroName).add(HP);
            heroes.get(heroName).add(MP);
        }

        String commands = scanner.nextLine();

        while (!commands.equals("End")) {
            String[] commandsData = commands.split(" - ");
            String heroName = commandsData[1];
            switch (commandsData[0]) {
                case "CastSpell":
                    int neededMP = Integer.parseInt(commandsData[2]);
                    String spellName = commandsData[3];
                    if (heroes.get(heroName).get(1) >= neededMP) {
                        heroes.get(heroName).set(1, heroes.get(heroName).get(1) - neededMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroes.get(heroName).get(1));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandsData[2]);
                    String attackerName = commandsData[3];
                    heroes.get(heroName).set(0, heroes.get(heroName).get(0) - damage);
                    if(heroes.get(heroName).get(0) > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n"
                                ,heroName,damage,attackerName,heroes.get(heroName).get(0));
                    }else{
                        System.out.printf("%s has been killed by %s!%n",heroName,attackerName);
                        heroes.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int rechargeMP = Integer.parseInt(commandsData[2]);
                    if(heroes.get(heroName).get(1) + rechargeMP > 200){
                        rechargeMP = 200 - heroes.get(heroName).get(1);
                    }
                    heroes.get(heroName).set(1,heroes.get(heroName).get(1) + rechargeMP);
                    System.out.printf("%s recharged for %d MP!%n",heroName,rechargeMP);
                    break;
                case "Heal":
                    int rechargeHP = Integer.parseInt(commandsData[2]);
                    if(heroes.get(heroName).get(0) + rechargeHP > 100){
                        rechargeHP = 100 - heroes.get(heroName).get(0);
                    }
                    heroes.get(heroName).set(0,heroes.get(heroName).get(0) + rechargeHP);
                    System.out.printf("%s healed for %d HP!%n",heroName,rechargeHP);
                    break;
            }

            commands = scanner.nextLine();
        }
        for (Map.Entry<String, List<Integer>> entry : heroes.entrySet()) {
            System.out.printf("%s%n  HP: %d%n  MP: %d%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }

    }
}
