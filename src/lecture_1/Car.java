package lecture_1;

public class Car {
    String brand;
    int speed;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public void run() {
        System.out.println("Running...");
    }

    public void stop() {
        System.out.println("Stopping...");
    }

    public void accelerate() {
        speed+=10;
        System.out.println("Accelerating...");
    }

    public void decelerate() {
        System.out.println("Decelerating...");
    }

    public void turnLeft() {
        System.out.println("Turning left...");
    }

    public void turnRight() {
        System.out.println("Turning right...");
    }

}
