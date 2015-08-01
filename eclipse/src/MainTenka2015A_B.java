import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTenka2015A_B {
    static Pattern p = Pattern.compile("(\\d+):(\\d+):(\\d+)\\.(\\d+)");
    public static void main(String[] args) {
        List<Long> froms = new ArrayList<>();
        List<Long> tos = new ArrayList<>();
        try(Scanner sc = new Scanner(System.in)){
            int n =sc.nextInt();
            long leapFrom = 0;
            long leapTo = 24*60*60*1000;
            for(int i=0;i<n;i++){
                long f = getLong(sc.next());
                long t = getLong(sc.next());
                if(t-f<=0){
                    if(leapFrom<f)
                        leapFrom=f;
                    if(t<leapTo)
                        leapTo=t;
                }
                froms.add(f);
                tos.add(t);
            }
            if(leapFrom==0){
                for(int i=0;i<n;i++)
                    System.out.println(-1);
                return;
            }
            leapFrom-=1000;
            leapTo+=1000;
            
            for(int i=0;i<n;i++){
                long from = froms.get(i);
                long to = tos.get(i);
                if(to-from<=0){
                    System.out.println(to-from+1000);
                }else if(from<=leapFrom&&leapTo<=to){
                    System.out.println(to-from+1000);
                }else if(to<=leapFrom||leapTo<=from){
                    System.out.println(to-from);
                }else{
                    System.out.println(-1);
                }
                
            }

        }
    }

    private static Long getLong(String next) {
        Matcher m = p.matcher(next);
        m.find();
        return Long.valueOf(m.group(1))*60*60*1000
            +Long.valueOf(m.group(2))*60*1000
            +Long.valueOf(m.group(3))*1000
            +Long.valueOf(m.group(4));
    }
}
