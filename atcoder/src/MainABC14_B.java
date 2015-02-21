import java.util.*;
public class MainABC14_B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int X = s.nextInt();
        int ret=0;
        
        for(int i = 0;i<n;i++){
            int a = s.nextInt();
            if((X>>i)%2==1){
                ret+=a;
            }
        }
        
        
        System.out.println(ret);

    }


}
