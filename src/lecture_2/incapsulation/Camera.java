package lecture_2.incapsulation;

public class Camera {
    private int memory;
    private String[] photos = new String[memory];

    public Camera(int memory) {
        this.memory = memory;
    }

    public void takePhoto() {
        if (memory > 0) {
            memory -= 10;
            System.out.println("Photo taken!");
        } else {
            System.out.println("Not enough memory!");
        }
    }
}
