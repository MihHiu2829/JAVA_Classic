

    import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class baitap27 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Input.txt");
        Scanner in = new Scanner(file);
            if(in.hasNext()){
                String line = in.next();
                System.out.println(line);
            }
    }
}

