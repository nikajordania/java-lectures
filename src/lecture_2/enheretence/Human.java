package lecture_2.enheretence;

public class Human extends Character {
    public int hunger;

    public Human(String name, int hunger) {
        super(100, 1, 1, name);
        this.hunger = hunger;
    }

    public void talk() {
        System.out.println("Human " + this.getName() + " is talking");
    }

    public void eat() {
        hunger -= 10;
        System.out.println("Human " + this.getName() + " is eating");
    }
}
