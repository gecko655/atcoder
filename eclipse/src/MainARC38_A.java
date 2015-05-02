import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class MainARC38_A {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            int n = s.nextInt();
            List<Long> a = new ArrayList<>(); 
            for(int i=0;i<n;i++){
                a.add(s.nextLong());
            }
            a.sort(Comparator.reverseOrder());
            long ans=0;
            for(int i=0;i<n;i+=2){
                ans+=a.get(i);
            }
            System.out.println(ans);
        }
    }
}
