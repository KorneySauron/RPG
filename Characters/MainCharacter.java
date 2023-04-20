package Characters;

import Backstage.GameProcess;
import GameLocations.GameLocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import Backstage.ImpInstruments;

public class MainCharacter {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public String name;

    public int health = 100;

    public MainCharacter(String newName) {
        name = newName;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static void meet(ArrayList foes, GameLocation location, MainCharacter mc) throws IOException {
        System.out.println("*Проходит несколько часов*");
        System.out.println("Мы уже очень долго блуждаем...");
        System.out.println("Погоди, что это?...");
        System.out.println("Это же " + location.getName() + "!");
        System.out.println("Там бродят монстры! На данный момент конкретно:" + location.getMonsters());
        System.out.println("""
                "Что мы сделаем?!"
                1."Перебьем их всех!" (Атаковать)
                2."Не будем рисковать." (Уйти и продолжить путешествие)
                3.Выйти из игры
                """);
        int answer = ImpInstruments.guardianCondition(br, 3);
        switch (answer) {
            case 1:
                MainCharacter.battle(foes, mc);
                break;
            case 2:
                System.out.println("Хорошо.");
                GameProcess.adventureGenerator(mc, br);
            case 3:
                return;
        }
    }

    public static void battle(ArrayList foes, MainCharacter mc) throws IOException {
        System.out.println(ImpInstruments.RED + "*НАЧАЛСЯ БОЙ*");
        for (int i = 0; i < foes.size(); i++) {
            fight((UndeadKnight) foes.get(i), mc);
            if (i==foes.size()){
                System.out.println("Отлично! Мы их одолели! Можем идти дальше!");
                GameProcess.adventureGenerator(mc,br);
            }
        }
    }

    public static void fight(UndeadKnight foe, MainCharacter mc) throws IOException {
        System.out.println("Перед тобой стоит " + foe.getType() + " с " + foe.getHealth() + " здоровья");
        System.out.println("Что ты будешь делать?");
        System.out.println("""
                1.Атаковать
                2.Уклониться
                3.Блокировать
                4."Сколько у меня здоровья?!"
                """);
        int action = ImpInstruments.guardianCondition(br, 4);
        switch (action) {
            case 1:
                int damage = ImpInstruments.numberGenerator(5, 11);
                foe.setHealth(foe.getHealth() - damage);
                if (foe.getHealth() == 0) {
                    System.out.println(foe.getType() + "повержен!"+ImpInstruments.RESET);
                } else {
                    fight(foe, mc);
                }
//            case 2:
//                int result = ImpInstruments.numberGenerator(0, 2);
//                if (result == 0) {
//                    System.out.println("Не вышло!");
//                    mc.setHealth(mc.getHealth() - foe.getDamage());
//                    if (mc.getHealth() == 0) {
//                        System.out.println(ImpInstruments.RED + "ТЫ УМЕР!");
//                    } else {
//                        System.out.println("Харош!");
//                        fight(foe, mc);
//                    }
//                }
//            case 3:
//                int blockResult = ImpInstruments.numberGenerator(0, 1);
//                if (blockResult == 0) {
//                    System.out.println("Не вышло!");
//                    mc.setHealth(mc.getHealth() - foe.getDamage());
//                    if (mc.getHealth() == 0) {
//                        System.out.println(ImpInstruments.RED + "ТЫ УМЕР!");
//                        return;
//                    }
//                } else {
//                    System.out.println("Харош!");
//                    fight(foe, mc);
//                }
            case 4:
                System.out.println("У тебя " + mc.getHealth()+ "здоровья!");
                fight(foe, mc);
        }
    }
}
