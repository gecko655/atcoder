import java.math.BigInteger;
import java.util.Scanner;
public class MainABC21_D {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            long n = s.nextLong();
            long k = s.nextLong();
            n+=k;
            k=Math.min(n-k, k);
            BigInteger ans = BigInteger.ONE;
            for(long i=1;i<=k;i++){
                ans = ans.multiply(BigInteger.valueOf(n-k+i-1))
                    .divide(BigInteger.valueOf(i));
            }
            System.out.println(ans.mod(BigInteger.valueOf(1_000_000_007)).longValue());
        }
    }

}
