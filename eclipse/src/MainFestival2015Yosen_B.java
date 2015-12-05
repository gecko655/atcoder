import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFestival2015Yosen_B {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            long n = sc.nextLong();
            long ans =0;
            while(n>0){
                n--;
                ans += sc.nextLong()*Math.pow(2, n);
            }
            System.out.println(ans);
        }
    }

}
