import java.util.Scanner;

public class MainFestival2015Yosen_A {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String a = sc.next();
            System.out.println(a.substring(0,a.length()-4)+"2015");
        }
    }

}
