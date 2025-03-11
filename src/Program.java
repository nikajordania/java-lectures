public class Program {

    public static void main(String[] args) {
        Car car123 = new Car();

        car123.brand = "Toyota";
        car123.speed = 0;

        System.out.println("Speed: " + car123.speed);

        car123.displayInfo();

        car123.run();
        car123.accelerate();

        System.out.println("Speed: " + car123.speed);

        car123.decelerate();
        car123.turnLeft();
        car123.turnLeft();
        car123.turnRight();
        car123.stop();
    }

}