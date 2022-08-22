package exercise;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class bai_50_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        Random rd = new Random() ;
        bai_50_collection CC = new bai_50_collection() ;
        System.out.println("Nhap gia tri cua n: ");
        int n = sc.nextInt()  ;
        for(int i=0;i<n;i++){
            bai_50_Cricle ad = new bai_50_Cricle(rd.nextDouble(1,8));
            CC.addCricle(ad);
        }
        System.out.println("Xuat thong tin cua cac hinh tron da nhap: ");
                CC.Infor();
        System.out.println("Tong dien tich: "+CC.Sum());
        System.out.println("Dien tich lon nhat: "+ CC.findMaxArea());
        System.out.println("Thong tin hinh tron co dien tich nho nhat: ");
        System.out.println((CC.getMinCricle()).toString());
    }
}
