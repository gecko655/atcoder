import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainThanks2015_C {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            List<Long> a = new ArrayList<>();
            int b = sc.nextInt();
            for(int i=0;i<b;i++)
                a.add(sc.nextLong());
            long order=1;
            long x = sc.nextLong();
            for(int i=0;i<b;i++){
                if(x<a.get(i)){
                    System.out.println(order);
                    return;
                }
                order++;
            }
            System.out.println(order);
        }
    }
}
