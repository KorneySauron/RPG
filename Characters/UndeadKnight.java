package Characters;

public class UndeadKnight extends Foe {
    public int health = 35;
    int damage= 15;

    public int getDamage() {
        return damage;
    }

    String type = "Рыцарь-Мертвец";

    public String getType() {
        return type;
    }

    public UndeadKnight() {
        super();
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
