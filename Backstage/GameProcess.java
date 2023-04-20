package Backstage;

import Characters.MainCharacter;
import GameLocations.AbandonedVillage;
import GameLocations.Castle;
import GameLocations.GameLocation;
import GameLocations.Mountains;

import java.io.*;
import java.util.*;

public class GameProcess {
    static Map<Integer, GameLocation> locations = new HashMap<>();

    public GameProcess() {
        locations.put(1, new AbandonedVillage());
        locations.put(2, new Castle());
        locations.put(3, new Mountains());

    }


    public static void launch() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ImpInstruments.CYAN + "Привестствую!");
        System.out.println("Я-твой рассказчик. Так как ты слеп, я помогу тебе ориентироваться, что с тобой происходит");
        System.out.println("Поведай, как тебя звать?");
        System.out.println("""
                1.Сказать свое имя
                2."А кто ты?"
                3. Выйти из игры""");
        int answer = ImpInstruments.guardianCondition(br, 3);
        switch (answer) {
            case 1:
                System.out.print("Меня зовут:");
                String name = br.readLine();
                MainCharacter mc = new MainCharacter(name);
                System.out.println("Приятно познакомиться, "+name+"! Держи свой клинок, с его помощью ты сможешь защищаться от нелицеприятных жителей этого мира.");
                System.out.println("И возьми еще щит. Поверь, без него никак. А теперь, вперед за приключениями!");
                GameProcess.adventureGenerator(mc, br);
            case 2:
                System.out.println("Неважно. Важнее кто ты.");
                name = br.readLine();
                mc = new MainCharacter(name);
                System.out.println("Приятно познакомиться, "+name+"! Держи свой клинок, с его помощью ты сможешь защищаться от нелицеприятных жителей этого мира.");
                System.out.println("И возьми еще щит. Поверь, без него никак. А теперь, вперед за приключениями!");
                GameProcess.adventureGenerator(mc, br);
            case 3:
                break;
        }
    }

    public static void adventureGenerator(MainCharacter mc, BufferedReader br) throws IOException {
        System.out.println("Куда пойдем?");

        System.out.println("""
                1.Прямо
                2.Направо
                3.Налево
                4."Не знаю, а куда ты предложишь?"
                5.Выйти из игры""");
        int answer=ImpInstruments.guardianCondition(br,5);

//        int numberOfLoc=ImpInstruments.numberGenerator(1,4);
//        GameLocation location;
//        if (numberOfLoc==1){
            Castle location=new Castle();
//        } else if (numberOfLoc==2){
//            location=new AbandonedVillage();
//        } else {
//            location=new Mountains();
//        }
        switch (answer) {
            case 1, 2, 3:
                System.out.println("Тогда пошли. Приключения зовут!");
                MainCharacter.meet(location.spawner(), location, mc);
            case 4:
                int offer = ImpInstruments.numberGenerator(1, 4);
                String direction;
                if (offer==1){
                    direction="прямо";
                } else if (offer==2) {
                    direction="направо";
                } else {
                    direction="налево";
                }
                System.out.println("Давай пойдем тогда " + direction);
                MainCharacter.meet(location.spawner(), location, mc);
            case 5:
                return;
        }
    }
}
