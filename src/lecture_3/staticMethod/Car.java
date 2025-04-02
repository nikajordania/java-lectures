package lecture_3.staticMethod;

import java.util.logging.Logger;

public class Car {
    public static int count = 0;
    public String model;
    public static String api_key;
    final static Logger logger = Logger.getLogger("MyLogger");

    static {
        api_key = "ASdasdfsf";
        System.out.println("hello");
    }

    public Car(String model) {
        count++;
        this.model = model;
        System.out.println(model);
        System.out.println(count);
    }

    public Car() {

    }

    public static void staticMethod() {
        count += 10;
        System.out.println("This is a static method.");
    }
}
