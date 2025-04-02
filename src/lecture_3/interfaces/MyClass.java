package lecture_3.interfaces;

public class MyClass implements MyInterface {
    @Override
    public void print1() {
        System.out.println("asdads");
    }

    @Override
    public void print() {
        MyInterface.super.print();
        System.out.println("Finish method");
    }

    @Override
    public Integer sum(Integer v1, Integer v2) {
        return 0;
    }

    public static void main(String[] args) {
        MyInterface.read();

        MyClass myClass = new MyClass();

        myClass.print();
    }
}

