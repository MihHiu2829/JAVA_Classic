package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> StackChuoi = new Stack<String>();
//        StackChuoi.push("gia tri") ;  dua gia tri vao
        // StackChuoi.pop() => lay gia tri ra va xoa khoi stack
        // StackChuoi.peek() => lay gia tri ra nhung khong xoa.
        // StackChuoi.clear() => xoa tat ca phan tu trong stack .
        //StackChuoi.contains("kieu dua lieu can tim kiem") ; => xac dinh xem gia tri co ton tai trong stack hay ko.
        // Vi du dao nguoc chuoi:
        System.out.println("Nhap vao chuoi: ");
        String s = sc.nextLine();
        int i = 0;
        while (i < s.length())
            StackChuoi.push(s.charAt(i++)+"") ;
        for(i = 0;i<s.length();i++)
        {
            System.out.print(StackChuoi.pop()+" ");
        }
        // vi du chuyen tu he thap phan sang he nhi phan :
        Stack<Integer>St = new Stack<Integer>();
        System.out.println("Nhap 1 so nguyen duong tu ban phim: ");
        int number = sc.nextInt() ;
          int chiadu =1 ;
        while(number != 0 ) {
            int tmp = number / 2 ;
            chiadu = number - tmp*2 ;
            St.push(chiadu) ;
            number/=2 ;
        }
        int n = St.size() ;
        for(i=0;i<n ;i++)
        {
            System.out.print(St.pop());
        }
    }
    }
