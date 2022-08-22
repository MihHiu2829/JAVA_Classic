package OOP_12;

public class Animal {
    protected String name ;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("I am eatting.... ") ;
    }
    public void makeSound(){
        System.out.println("........sound........");
    }
    public void sleep(){
        System.out.println("zzz zzz zzz");
    }
}
