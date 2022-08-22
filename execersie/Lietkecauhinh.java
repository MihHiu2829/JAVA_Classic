import java.util.Scanner;

public class Lietkecauhinh {
    public static void main(String[] args) {
        System.out.println("N= ");
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n;i++){
            a[i]=0;
        }
        int i;
        do {
            for (int j=0; j<n;j++){
                System.out.print(a[j]);
            }
            System.out.printf("\t");
            i = n-1;
            while ((i>-1)&&(a[i]==1)) {
                --i;
            }
            if (i>-1){
                a[i] = 1;
                for (int j=i+1; j<n;j++){
                    a[j]=0;
                }
            }
        }while (i!=-1);
    }
}
