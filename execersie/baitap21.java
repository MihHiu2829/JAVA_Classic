package execersie;
import java.util.Scanner;

public class baitap21 {
    public static void main(String[] aStrings) {
        int m, n;
        int[][] arr, brr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap m,n: ");
        m = scanner.nextInt();
        n = scanner.nextInt();
        System.out.println("Nhap ma tran a[][]: ");
        arr = nhap(m, n, scanner);
          xuat(arr);
        brr = chuyenvi(arr);
          xuat(brr); 
    }

    private static int[][] chuyenvi(int[][] a) {
        int[][] brr = new int[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                brr[i][j] = a[j][i];
            }
        }
        return brr;
    }

    private static int[][] nhap(int m, int n, Scanner a) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = a.nextInt();
            }
        }
        return x;
    }

    private static void xuat(int[][] a) {
      
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                     System.out.printf("%d\t",a[i][j]);
            }
            System.out.println(); 
        }
    }
}
