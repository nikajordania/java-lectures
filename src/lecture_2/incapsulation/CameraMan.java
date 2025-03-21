package lecture_2.incapsulation;

public class CameraMan {
    public static void main(String[] args) {
        Camera camera = new Camera(100);

        System.out.println(camera.getMemory());

        for (int i = 0; i < 11; i++) {
            camera.takePhoto();
        }

        System.out.println(camera.getMemory());
    }
}