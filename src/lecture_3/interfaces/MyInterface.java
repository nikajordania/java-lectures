package lecture_3.interfaces;

interface MyInterface {
    void print1();

    default void print() {
        System.out.println("Undefined method");
    }

    Integer sum(Integer v1, Integer v2);

    static void read() {
        System.out.println("Read printable");
    }

}
