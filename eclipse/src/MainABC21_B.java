import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class MainABC21_B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int k = s.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<k;i++){
            int p = s.nextInt();
            if(p==a||p==b||!set.add(p)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
