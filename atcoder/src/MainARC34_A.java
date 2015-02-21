import java.util.*;
public class MainARC34_A {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        double max=0;
        for(int i=0;i<n;i++){
            double sum=0;
            for(int j=0;j<4;j++)
                sum+=s.nextInt();
            sum+=110.0/900.0*s.nextInt();
            if(max<sum)
                max=sum;
        }
        System.out.println(max);

    }

}
