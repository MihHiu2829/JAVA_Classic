package Files_huy_thai;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String s ;
        System.out.println("Nhap duong truyen ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine() ;
        File files = new File(s);
        BufferedReader dr = Files.newBufferedReader(files.toPath(), StandardCharsets.UTF_8) ;
        String line   ;
        byte[] a;
        line = dr.readLine() ;
        a = line.getBytes() ;
        int m = 0 , tmp = 0 ;
        int n =  0 ;
        m = a[0] - 48 ;
     for(int i=1;i<a.length;i++){
         if(a[i] != 32 ) n = a[i] - 48 ;
     }
        int array[][] =  array = new int[m][n] ;
        for(int i=0;i<m;i++){
            tmp = 0 ;
            line  =  dr.readLine() ;
            a = line.getBytes();
            for(int j = 0 ; j< a.length;j++){
                if(a[j] != 32 )  {
                    array[i][tmp++] =  a[j] - 48 ;
                }
            }
        }
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               System.out.print(array[i][j]+" ");
           }
           System.out.println("");
       }

    }
}
