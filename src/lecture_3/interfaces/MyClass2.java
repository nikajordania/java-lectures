package lecture_3.interfaces;

public class MyClass2 implements MyInterface {
    @Override
    public void print1() {
        // not implemented yet
    }

    @Override
    public void print() {
        System.out.println("some overriding");
    }

    @Override
    public Integer sum(Integer v1, Integer v2) {
        return 0;
    }

}
