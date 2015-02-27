import java.util.*;
public class MainARC34_C {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        Map<Integer,Integer>primes = new HashMap<Integer,Integer>();
        for(;b<a;b++){
            int j=b+1;
            for(int i=2;i*i<=j;i++){
                while(j%i==0){
                    primes.put(i, primes.containsKey(i)?primes.get(i)+1:1);
                    j/=i;
                }
            }
            if(j>1)
                primes.put(j, primes.containsKey(j)?primes.get(j)+1:1);
        }
        
        long ret = 1;
        for(int p: primes.values()){
            ret=(ret*(p+1))%1_000_000_007;
        }
        System.out.println(ret);

    }

}
