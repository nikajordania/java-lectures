package lecture_2.enheretence;

public class Human extends Character {
    public int hunger;

    public void talk() {
        System.out.println("Human " + name + " is talking");
    }

    public void eat() {
        hunger -= 10;
        System.out.println("Human " + name + " is eating");
    }
}
