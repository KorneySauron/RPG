package GameLocations;

import Characters.Foe;
import Characters.Yeti;

import java.util.ArrayList;
import java.util.Random;

public class Mountains extends GameLocation{
    String name= "ГОРЫ";
    String monsters="ЙЕТИ";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMonsters() {
        return monsters;
    }

    public Mountains(){
        super();
    }
    @Override
    public ArrayList<Foe> spawner() {
        Random random = new Random();
        int foesAmount = random.nextInt(1, 6);
        int i = 0;
        ArrayList<Foe> yetis = new ArrayList<>();
        while (i < foesAmount) {
            ++i;
            Yeti yeti = new Yeti();
            yetis.add(yeti);
        }
        return yetis;
    }
}
