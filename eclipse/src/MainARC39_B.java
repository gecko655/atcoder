import java.math.BigInteger;
import java.util.Scanner;
public class MainARC39_B {
    static long[] f = new long[1000];
    static long mod = 1_000_000_007;
    static BigInteger MOD = BigInteger.valueOf(mod);
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            calcFactorial();
            int n = s.nextInt();
            int k = s.nextInt();
            long ans;
            if(n<=k){
                if(k%n==0){
                    ans = 1;
                }else{
                    ans = comb(n,k%n);
                }
            }else{
                ans = comb(n+k-1,k);
            }
            System.out.println(ans);
        }
        
    }
    static long comb(int n,int k){
        long a = BigInteger.valueOf(f[k]).modInverse(MOD).longValue();
        long b = BigInteger.valueOf(f[n - k]).modInverse(MOD).longValue();
        return f[n]*a%mod*b%mod;
    }
    
    static void calcFactorial(){
        long ff = 1;
        for(int i=1;i<f.length;i++){
            ff = (ff*i)%mod;
            f[i]=(ff);
        }
        
    }
}
