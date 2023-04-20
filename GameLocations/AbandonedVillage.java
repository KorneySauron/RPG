package GameLocations;

import Characters.*;

import java.util.ArrayList;
import java.util.Random;

public class AbandonedVillage extends GameLocation {
    String name="ДЕРЕВНЯ";
    String monsters="Скелеты";
    @Override
    public String getMonsters() {
        return monsters;
    }

    public AbandonedVillage() {
        super();
    }
@Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Foe> spawner() {
        Random random = new Random();
        int foesAmount = random.nextInt(1, 6);
        int i = 0;
        ArrayList<Foe> skeletons = new ArrayList<>();
        while (i < foesAmount) {
            ++i;
            Skeleton skeleton = new Skeleton();
            skeletons.add(skeleton);
        }
        return skeletons;
    }
}
