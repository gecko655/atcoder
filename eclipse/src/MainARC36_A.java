import java.util.*;
public class MainARC36_A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        for(int i=1;i<=n;i++){
            a1 = a2;
            a2 = a3;
            a3 = s.nextInt();
            if(i>=3&&a1+a2+a3<k){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        

    }

}
