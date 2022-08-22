package execersie;


    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;
    
    public class baitap18make2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap vao so phan tu cua mang: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++) {
                arr[i] = rand.nextInt(100);
            }
    
            System.out.println("Mang truoc khi sap xep la: ");
            for (int item:arr) {
                System.out.print(item + " ");
            }
            System.out.println("\nMang sau khi sap xep la: ");
            Arrays.sort(arr);
            for (int item:arr){
                System.out.print(item + " ");
            }
            System.out.println("");
            int count = 1;
            for (int i = 0; i < n-1; i++) {
               if(arr[i] != arr[i+1])
                   count++;
            }
            int n2 = count;
            int[] arr2 = new int[n2];
    
            int index = 1;
            arr2[0] = arr[0];
            for (int i = 1; i < n2; i++) {
                for (; index < n; index++){
                    if (arr[index] != arr[index - 1])
                        break;
                }
                arr2[i] = arr[index];
                index++;
            }
            System.out.println("Mang cuoi cung: ");
            for (int item:arr2) {
                System.out.print(item + " ");
            }
        }
    } 

