package phuong_thuc_array;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = "0123456789";
//        System.out.println("Nhap vao chuoi: ");
//        s = sc.nextLine() ;
        System.out.println("--------");
        System.out.println(s);
        // length.
        System.out.print("Do dai cua ki tu: ");
        System.out.println(s.length());
        //charAt.
        System.out.print("Vi tri cua ki tu thu 3: ");
        System.out.println(s.charAt(3) );
        // getChars(vi tri bat dau, vi tri ket thuc, mang lu du lieu,vi tri bat dau luu cua mang ;
        char a[] = new char[s.length()];
        s.getChars(2,4,a,0);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        // getByte
        byte[] aB = s.getBytes() ;
        for (byte b:
             aB) {
            System.out.print(b+"  ");
        }
       //hash_code chua dc hoc :)
        // ============================================================================================================
        // so sanh chuoi :v
        String s1 ="Doan Minh Hieu" ;
        String s2 = "doan Minh Hieu" ;
        String s3 = "doan mih hieu" ;
        // ham equals =>> phan biet hoa va thuong !
        System.out.println("S1 equals s2: "+ s1.equals(s2));
        System.out.println("S1 equals s2: "+ s2.equals(s3));
        System.out.println("S1 equals s2: "+ s3.equals(s1));
        // ham equalsIgnoreCase
        // khong phan biet chu hoa va chu thuong !
        System.out.println("S1 equals Ignore Case S2: " + s1.equalsIgnoreCase(s3));
         //campare to
        // so sanh menh de nao lon hon !
        // < 0 la menh de 1 nho hon menh de 2
        // > 0 la menh de 1 lon hon menh de 2
        // = 0 la 2 menh de bang nhau
        String sv1 = "Vuong Man Tam" ;
        String sv2 = "Nguyen Thanh Lam" ;
        String sv3 = "Doan Minh Hieu" ;
        String sv4 = "Nguyen Ngoc Quyen ";
        System.out.println("Sv2 compare to sv1 "+ sv2.compareTo(sv1));
        System.out.println("Sv3 compare to sv1 "+ sv3.compareTo(sv1));
        System.out.println("Sv2 compare to sv1 "+ sv2.compareTo(sv1));
        System.out.println("sv4 compare to sv3 "+ sv4.compareTo(sv3));
        // campareToIgnoreCase ! giong voi  equalsIgnoreCase
        String sv3_1 = "doan minh hieu" ;
        System.out.println("sv3 compare to Ignore Case with sv3_1: "+ sv3.compareToIgnoreCase(sv3_1));  // result = 0  ;
        // regionMatches
        String r1 = "Dawn.vn" ;
        String r2 =  "xwn.vn" ;
        // regionMatches(vi tri can so sanh, menh de 2 (bat dau tu 0) , vi tri so sanh tu menh de 2, so luong vi tri can so sanh)
        boolean check = r1.regionMatches(2,r2,1 ,4) ;
        System.out.println(check);
        // starwith => ham ktr chuoi bat dau bang ...
        String sdt = "0334568214"  ;
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("033"));
        // endWith => ktra chuoi ket thuc bang ...
        if (sdt.endsWith("8214")) System.out.println("so dt cua me Ha! ");
        else if (sdt.endsWith("4483"))
            System.out.println("So dien thoai cua Minh Hieu :v ");
            //=============================================================================================
        // xu li chuoi cach tim kiem chuoi trong java
        // ham indexOf
        String ss1 = "Xin chao co chu, xin chao cac ban, Xin chao! " ;
        String ss2 = "Xin chao"  ;
        String ss3 = "xin chao 123 " ;
        System.out.println("Vi tri cua S2 trong s1 la: "+ ss1.indexOf(ss2));
        System.out.println("vi tri cua s3 trong s1 la: "+ ss3.indexOf(ss2));
        // su dung vi tri bat dau ;
        System.out.println("Vi tri cua s2 trong s1 la: "+ ss2.indexOf(ss1,2));
        // tim kiem char
        char c1 = 'a'   ;
        System.out.println("Vi tri cua s1 trong c1 la  "  + ss2.indexOf(c1));
        // lastIndexOf => tiem kiem tu phai sang trai
        System.out.println("vi tri cua s2  trong s1   la: "+ ss1.lastIndexOf(ss2));
        //===========================================================================================
        // cat, noi, thay the, chuyen kieu chua hoa-thuong trong java .
        String S1 = "tItv" ;
        String S2 = ".Vn" ;
        String S3 = S1 +S2 ;
        // concat => noi chuoi !
        String S4 = S1.concat(S2) ;
        System.out.println("s3= "+ S3);
        System.out.println("s4= "+ S4);
        // replace all => ham thay the
        // khong tra ve gia tri
        String s5 = "Tung.vn"  ;
       String s6 =  s5.replaceAll(s5,"Titv") ;
        System.out.println("S6 = " + s6 );
        // toLowerCase and toUpperCase ham chuyen doi viet thuong va viet hoa nhma phai gan gia tri
        String tmp1 = "Doan Minh Hieu"  ;
        System.out.println(tmp1.toUpperCase());
        // trim() => xoa khoang trang du thua o dau chuoi
        String s9 = " Xin chao cac ban, minh la Doan Minh Hieu   ";
        System.out.println(s9.trim());
        //toCharArray => bien doi 1 chuoi thanh 1 mang ki tu !
        // subString => cat chuoi con
        // copy chuoi goc ban dau thanh chuoi con =]]
        String s10 = "xin chao cac ban,minh la titv.vn" ;
        String s11 = s10.substring(10)  ;
        String s12 = s10.substring(10,15)  ;


    }
}
