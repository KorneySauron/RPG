package Characters;

public abstract class Foe {
    public String type="Неизвестный противник";
    int damage=10;

    public int getDamage() {
        return damage;
    }

    public String getType(){
        return type;
    }
    boolean alive = true;

    public boolean getAlive() {
        return alive;
    }

    public boolean setAlive(Foe foe) {
        int foesHealth = foe.getHealth();
        if (foesHealth == 0) {
            foe.alive = false;
        }
        return foe.alive;
    }

    public int health;

    public Foe() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
