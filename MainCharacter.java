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
}
