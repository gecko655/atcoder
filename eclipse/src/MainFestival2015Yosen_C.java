import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainFestival2015Yosen_C {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            long t = sc.nextLong();
            long sum = 0;
            List<Integer> subs = new ArrayList<>();
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                sum+=a;
                subs.add(a-b);
            }

            subs.sort(Comparator.reverseOrder());
            int copy=0;
            for(int sub:subs){
                if(sum<=t) break;
                sum-=sub;
                copy++;
            }
            if(sum<=t)
                System.out.println(copy);
            else
                System.out.println(-1);

        }
    }

}
