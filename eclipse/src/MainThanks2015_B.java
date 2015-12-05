import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainThanks2015_B {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            List<Long> a = new ArrayList<>();
            List<Long> b = new ArrayList<>();
            for(int i=0;i<2;i++)
                a.add(sc.nextLong());
            for(int i=0;i<2;i++)
                b.add(sc.nextLong());
            long c = sc.nextLong();
            Set<Long> ans = new HashSet<>();
            if(!a.contains(c))
                ans.addAll(a);
            else if(!b.contains(c))
                ans.addAll(b);
            else{
                ans.addAll(a);
                ans.addAll(b);
            }
            System.out.println(ans.size());
            ans.stream().sorted().forEach(System.out::println);

        }
    }
    

}
