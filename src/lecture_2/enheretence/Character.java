package lecture_2.enheretence;

public abstract class Character {
    public int hp;
    public int xp;
    public int mana;
    public int level;
    public String name;


    public Character(int hp, int mana, int level, String name) {
        this.hp = hp;
        this.mana = mana;
        this.level = level;
        this.name = name;

        System.out.println(name);
    }

    public void go() throws InterruptedException {
        System.out.println("Character " + name + " is going");
    }

    public void fight() {
        System.out.println("Character " + name + " is fighting");
    }


    public int getLevel() {
        return level;
    }


    public void setLevel(int level) {
        if (level > 3) {
            System.out.println("Level can't be more than 3");
            return;
        }
        this.level = level;
    }

    public void increaseLevel() {
        level++;
    }

    protected String getName() {
        return name;
    }
}
