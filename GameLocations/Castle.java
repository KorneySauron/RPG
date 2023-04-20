package GameLocations;

import Characters.BlackKnight;
import Characters.Foe;
import Characters.Skeleton;
import Characters.UndeadKnight;

import java.util.ArrayList;
import java.util.Random;

public class Castle extends GameLocation {
    String name= "ЗАМОК";

    String monsters="Рыцари-мертвецы и Черный рыцарь";
    @Override
    public String getMonsters() {
        return monsters;
    }

    public Castle(){super();}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Foe> spawner() {
        Random random = new Random();
        int foesAmount = random.nextInt(1, 5);
        int i = 0;
        ArrayList<Foe> knights = new ArrayList<>();
        while (i < foesAmount) {
            ++i;
            UndeadKnight knight = new UndeadKnight();
            knights.add(knight);
        }
//        knights.add(new BlackKnight());
        return knights;
    }
}
