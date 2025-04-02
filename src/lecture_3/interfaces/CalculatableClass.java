package lecture_3.interfaces;

public class CalculatableClass implements Calculatable {
    @Override
    public int sum(int a, int b) {
        System.out.println("start sum operation...");
        return Calculatable.super.sum(a, b);
    }
}