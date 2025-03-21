package lecture_2.polymorphism;

public class Zoo {
    public static void main(String[] args) {
        var animal = new Animal();
        var dog = new Dog();
        var cat = new Cat();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
