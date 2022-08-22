package mypack;

public class human {

        String name ; 
        int age ;  
        int salary ;  
       public human(){}; 
       public human(String name,int age,int salary){
           this.name = name ;  
           this.age = age ; 
           this.salary = salary ;  
       }
       public void show(){
           System.out.println(name);
           System.out.println(age);
           System.out.println(salary); 
       }

}
