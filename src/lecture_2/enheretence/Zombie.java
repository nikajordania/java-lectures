package lecture_2.enheretence;

public class Zombie extends Character {
    public int speedLimit;

    public void go() throws InterruptedException {
        Thread.sleep(speedLimit);
        System.out.println("Zombie " + name + " is going but really slow");
    }
}
