package OOP_12;

public class Dog extends Animal{

    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Let me bones");
    }

    @Override
    public void makeSound() {
        System.out.println("Gauw gauw");
    }
}
