import java.util.Scanner;

public class MainThanks2015_A {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = Math.max(Math.max(Math.abs(a),Math.abs(b)),Math.abs(a-b));

            System.out.println(c*2);
        }
    }
    

}
