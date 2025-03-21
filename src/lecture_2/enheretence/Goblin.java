package lecture_2.enheretence;

public class Goblin extends Character {
    public int rage;
    public String weapon;
    public int trickLevel;

    public Goblin(int mana, String name, int rage, String weapon, int trickLevel) {
        super(100, mana, 3, name);
        this.rage = rage;
        this.weapon = weapon;
        this.trickLevel = trickLevel;
    }

    public void scream() {
        System.out.println("Goblin " + name + " is screaming");
    }

    @Override
    public void fight() {
        System.out.println(trickLevel);
        System.out.println();

        if (level > 60) {
            hp += 10;

        } else {
            hp += 1;
        }
    }
}
