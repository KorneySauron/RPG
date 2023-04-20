package Backstage;

import Characters.MainCharacter;
import GameLocations.AbandonedVillage;
import GameLocations.Castle;
import GameLocations.GameLocation;
import GameLocations.Mountains;
import GameLocations.Dungeons;
import GameLocations.Forest;

import java.io.*;
import java.util.*;

public class GameProcess {
    static Map<Integer, GameLocation> locations = new HashMap<>();

    public GameProcess() {
        locations.put(1, new AbandonedVillage());
        locations.put(2, new Castle());
        locations.put(3, new Mountains());
        locations.put(4, new Forest());
        locations.put(5, new Dungeons());
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
        int answer = -1;
        ImpInstruments.guardianCondition(answer, br);
        switch (answer) {
            case 1:
                System.out.print("Меня зовут:");
                String name = br.readLine();
                MainCharacter mc = new MainCharacter(name);
                System.out.println("Приятно познакомиться! Держи свой клинок, с его помощью ты сможешь защищаться от нелицеприятных жителей этого мира.");
                System.out.println("И возьми еще щит. Поверь, без него никак. А теперь, вперед за приключениями!");
                GameProcess.adventureGenerator(mc, br);
            case 2:
                System.out.println("Неважно. Важнее кто ты.");
                name = br.readLine();
                mc = new MainCharacter(name);
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
        int answer = -1;
        while (answer < 0 || answer > 3) {
            try {
                answer = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.err.println("Введите корректное число!");
            }
            if (answer > 5) {
                System.out.println("Введите корректное число!");
            }
        }

        GameLocation location = locations.get(ImpInstruments.numberGenerator(1, 6));
        switch (answer) {
            case 1, 2, 3:
                System.out.println("Тогда пошли. Приключения зовут!");
                mc.meet(location.spawner(), location, mc);
                break;
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
                mc.meet(location.spawner(), location, mc);
            case 5:
                return;
        }
    }
}
