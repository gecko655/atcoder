import java.util.*;
public class MainARC34_B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();
        ArrayList<Long> answers=new ArrayList<Long>();
        for(long i=n-9*19;i<n;i++){
            if(i+f(i)==n)
                answers.add(i);
        }
        System.out.println(answers.size());
        for(Long answer: answers)
            System.out.println(answer);

    }
    private static long f(long i){
        long r = 0;
        while(i!=0){
            r+=i%10;
            i/=10;
        }
        return r;
    }

}
