import java.util.Scanner;
import java.util.stream.IntStream;
public class MainARC39_A {
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            int a = s.nextInt();
            int b = s.nextInt();
            int a3 = a/100%10;
            int b3 = b/100%10;
            int a2 = a/10%10;
            int b2 = b/10%10;
            int a1 = a/1%10;
            int b1 = b/1%10;
            System.out.println(
                IntStream.of(a-b+900-a3*100,a-b-100+b3*100,a-b+90-a2*10,a-b+b2*10,a-b+9-a1,a-b+b1).max().getAsInt()
            );
        }
        
    }
}
