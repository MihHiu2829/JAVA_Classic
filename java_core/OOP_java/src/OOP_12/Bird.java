package OOP_12;

public class Bird extends  Animal{
    public Bird() {
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("I eat bugs");
    }

    @Override
    public void makeSound() {
        System.out.println("con cac con cac");
    }
}
