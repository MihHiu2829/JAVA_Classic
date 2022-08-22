public class person{  
    int age ; 
    String name ;  
    float point ;  
    public person(String name,int age,float point){
        this.name = name ; 
        this.age = age ; 
        this.point = point ;  
    }
    public person(){} ; 
    public void eat(){
        System.out.println("Hello, i want eat something! ");
    }
    public void show(){
        System.out.println(name); 
        System.out.println(age); 
        System.out.println(point);
    }
}