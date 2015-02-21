import java.util.*;
public class MainABC11_B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str.toUpperCase().charAt(0) +str.toLowerCase().substring(1));
    }

}
