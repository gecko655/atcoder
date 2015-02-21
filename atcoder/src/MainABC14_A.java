import java.util.*;
public class MainABC14_A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        System.out.println(a%b==0?0:b-a%b);

    }


}
