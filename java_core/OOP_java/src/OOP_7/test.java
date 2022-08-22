package OOP_7;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        Date day1 = new Date(12,5,2003) ;
        Date day2 = new Date(21,11,2003) ;
        Date day3 = new Date(12,5,2003);
        Class class1 = new Class("21DTHC4","Khoa cong nghe thong tin");
        Class class2 = new Class("21TMA1","Khoa kinh te");
        Class class3 = new Class("21DTHC3","Khoa cong nghe thong tin");
        Student student1 = new Student("Doan Minh Hieu","2180602248",day1,9.23,class1);
        Student student2 = new Student("Nguyen Ngoc Quyen","2180602221",day2,8.23,class2);
        Student student3 = new Student("Nguyen Thanh Lam","2180602148",day3,4.23,class3);
        System.out.println("Ten khoa: ");
        System.out.println("SV1: "+student1.groupNameofLearning());
        System.out.println("Ten khoa: ");
        System.out.println("SV2: "+student2.groupNameofLearning());
        System.out.println("Ten khoa: ");
        System.out.println("SV3: "+student3.groupNameofLearning());
        System.out.println("Sv2 va Sv3: "+student1.equals(student2));
        System.out.println("Sv1  va Sv3: "+student1.equals(student3));


    }
}
