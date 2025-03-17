package lecture_2.enheretence;

public class Character {
    int hp;
    int mana;
    int level;
    String name;

    public void go() throws InterruptedException {
        System.out.println("Character " + name + " is going");
    }

    public void fight() {
        System.out.println("Character " + name + " is fighting");
    }

    public void getDamage() {
        hp -= 10;
        System.out.println("Character " + name + " got " + 10 + " damage");
    }
}
