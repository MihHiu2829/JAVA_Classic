package execersie;

import java.util.Scanner;

public class baitap22 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] aStrings) {
        int[][] a, b, c; 
        a = nhap() ;
        b = nhap(); 
        c = mutli(a,b);
        xuat(c); 

    }

    public static int[][] mutli(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            return null;
        }
        int[][] sum = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                sum[i][j] = quatrinh(a, b, i, j);
            }
        }
        return sum;
    }

    public static int[][] nhap() {
        int m, n;
        System.out.println("Nhap hang cua ma tran: ");
        m = in.nextInt();
        System.out.println("Nhap cot cua ma tran: ");
        n = in.nextInt();
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("a[%d][%d]: ", i, j);
                x[i][j] = in.nextInt();
            }
        }
        return x;
    }

    public static int quatrinh(int[][] a, int[][] b, int x, int y) {
        int sum = 0;
        for (int i = 0; i < a[0].length; i++) {
            sum += (a[x][i] * b[i][y]);
        }
        return sum;
    }

    public static void xuat(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
