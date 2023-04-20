package Characters;

import Backstage.GameProcess;
import GameLocations.GameLocation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import Backstage.ImpInstruments;

public class MainCharacter {
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public String name;

    public int health=100;

    public MainCharacter(String newName) {
        name = newName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public static void meet(ArrayList foes, GameLocation location, MainCharacter mc) throws IOException {
        System.out.println("*Проходит несколько часов*");
        System.out.println("Мы уже очень долго блуждаем...");
        System.out.println("Погоди, что это?...");
        System.out.println("Это же " + location.getName() + "!");
        System.out.println("""
                "Что мы сделаем?!"
                1."Перебьем их всех!" (Атаковать)
                2."Не будем рисковать." (Уйти и продолжить путешествие)
                3.Выйти из игры
                """);
        int answer=Integer.parseInt(br.readLine());
        ImpInstruments.guardianCondition(answer, br);
        switch (answer){
            case 1: MainCharacter.fight;
            break;
            case 2:
                System.out.println("Хорошо.");
                GameProcess.adventureGenerator(mc,br);
        }
    }
}
