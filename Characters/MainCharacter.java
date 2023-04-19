package Characters;

import java.util.ArrayList;

public class MainCharacter {
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

    public static void meet(ArrayList foes){
        System.out.println();
        System.out.println("""
                "Что мы сделаем?!"
                1."Перебьем их всех!" (Атаковать)
                2."Не будем рисковать." (Уйти и продолжить путешествие)
                3.Выйти из игры
                """);

    }
}
