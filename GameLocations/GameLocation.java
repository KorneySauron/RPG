package GameLocations;
import Characters.*;

import java.util.ArrayList;

public abstract class GameLocation {
    public abstract String getMonsters();
    public abstract String getName();

    public GameLocation(){
    }
    public abstract ArrayList<Foe> spawner();
}
