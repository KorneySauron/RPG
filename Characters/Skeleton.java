package Characters;

public class Skeleton extends Foe {
    String type = "Скелет";
    int damage = 5;

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public int health = 15;

    public Skeleton() {
        super();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
