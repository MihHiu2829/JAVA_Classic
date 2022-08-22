package stack_01;

import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Stack<String>stackChuoi = new Stack<String>() ;
//        stackChuoi.push("giai tri") ;  // => dua gia tri vao stack
//        stackChuoi.pop() ; // lay gia tri ra va xoa khoi stack
//        stackChuoi.peek() ;  // lay gia tri ra, nung khong xoa khoi stack
//        stackChuoi.clear(); // xoa tat ca phan tu trong stack !
//        stackChuoi.contains("giai tro"); // xac dinh gia tri co ton tai trong stack hay ko
        // vi du dau tien:
        System.out.println("Nhap vao chuoi: ");
        String s= sc.nextLine() ;
        for(int i=0;i<s.length();i++)
        {
            stackChuoi.push(s.charAt(i)+"") ;
        }
        System.out.println("Chuoi dao nguoc: ");
        for(int i=0;i<s.length();i++)
        {
            System.out.print(stackChuoi.pop());
        }
        Stack<Integer>stackInt = new Stack<Integer>();
        System.out.println("Nhap 1 so nguyen duong tu ban phim: ");
        int x = sc.nextInt() ;
        while(x>0){
            int soDu = x % 2 ;
            stackInt.push(soDu);
            x/=2;
        }
        int length = stackInt.size() ;
        for(int i=0;i<length;i++){
            System.out.println(stackInt.pop());
        }
    }
}
