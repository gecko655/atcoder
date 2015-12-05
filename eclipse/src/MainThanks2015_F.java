import java.util.Scanner;

public class MainThanks2015_F {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int zerocount=0;
            for(int i=0;i<n-1;i++){
                int s = sc.nextInt();
                int t = sc.nextInt();
                if(s==1||t==1)
                    zerocount++;
            }
            if(zerocount==1){
                System.out.println("A");
                return;
            }
            System.out.println((n-1)%2==1?"A":"B");
        }
    }


}
