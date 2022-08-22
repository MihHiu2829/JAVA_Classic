import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao toa do dau tien: ");
        x = input.nextInt();
        y = input.nextInt();
        System.out.println(x + " - " + y + "\n");
        String s;
        s = input.next();
        System.out.println(s);
        System.out.println(x + " - " + y );
        for (int i=0; i<s.length();i++){
            switch (s.charAt(i)){
                case 'D':
                    x++;
                    break;
                case 'B':
                    y++;
                    break;
                case 'T':
                    x--;
                    break;
                case 'N':
                    y--;
                    break;
                default: ;
            }
            System.out.println(x + " - " + y );
        }
    }
}
