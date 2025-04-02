package lecture_3.staticMethod;

public class StaticCount {
    public static Integer count = 0;

    public static void main(String[] args) {
        StaticCount sc1 = new StaticCount();
        StaticCount sc2 = new StaticCount();
        StaticCount sc3 = new StaticCount();

        sc1.count = 10;
        System.out.println("Count from sc1: " + sc1.count);
        System.out.println("Count from sc2: " + sc2.count);
        System.out.println("Count from sc3: " + sc3.count);
        System.out.println("Correct way to access static variable " + StaticCount.count);
    }

    public static boolean emailValidation(String email) {
        if (email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
}
