package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class bai_49 {
    public static Scanner sc = new Scanner(System.in );
    public static void main(String[] args) {

        System.out.println("Nhap so luong ban phim: ");
        int n = sc.nextInt();
           int a[] = new int[n];
           input(a);
         xoa(a,3) ;

    }
    public static void input(int a[]){
        System.out.println("Nhap vao phan tu trong mang: ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt() ;
        }
        System.out.println(Arrays.toString(a)) ;
    }
    public static  void ouput(int a[]){
        System.out.println(Arrays.toString(a)) ;
    }
    public static boolean Prime(int a){
        if (a <= 1 )  return false ;
        for(int i=2;i< a;i++)
        {
            if(a % i == 0 ) return false ;
        }
        return true ;
    }
    public static void outputPrime(int a[]){
        for(int i=0;i<a.length;i++){
            if(Prime(a[i]) )System.out.println(a[i]);
        }
    }
    public static void sapsep(int a[]){
        Arrays.sort(a);
    }
    public static boolean timkiem(int a[]){
        System.out.println("Nhap so muon tim: ");
        int z = sc.nextInt();
        Arrays.sort(a);
       if( Arrays.binarySearch(a,z) != 0) return true  ;
        return false ;
    }
    public static void xoa(int a[], int prime){
        int vitri = 0 ;
        int b[] = new int[a.length-1] ;
        for(int i=0;i<a.length;i++) {
            if (a[i] == prime) {
                vitri = i ;
               System.arraycopy(a,0,b,0,vitri);
               int z = a.length-vitri-1 ;
               System.arraycopy(a,vitri+1,b,vitri,z);
               break ;
            }
        }
        System.out.println(Arrays.toString(b));
        }
    }

