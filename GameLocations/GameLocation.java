package GameLocations;
import Characters.*;

import java.util.ArrayList;

public abstract class GameLocation {

    public GameLocation(){
    }
    public abstract ArrayList<Foe> spawner();
}
