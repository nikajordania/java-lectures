package lecture_2.enheretence;

public class Zombie extends Character {
    public int speedLimit;

    public Zombie() {
        super(150, 0, 2, "Zombie");

        speedLimit = 20;
    }

    public void go() throws InterruptedException {
        Thread.sleep(speedLimit);
        System.out.println("Zombie " + name + " is going but really slow");
    }
}
