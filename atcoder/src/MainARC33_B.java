import java.util.*;
public class MainARC33_B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int na = s.nextInt();
        int nb = s.nextInt();
        List<Long> a = new ArrayList<>(na);
        Set<Long> b = new HashSet<>(nb);
        for(int i=0;i<na;i++){
            a.add(s.nextLong());
        }
        for(int i=0;i<nb;i++){
            b.add(s.nextLong());
        }
        long common=0;
        long all=0;
        int aindex=0;
        long bcommon=0;
        while(true){
            if(aindex==a.size()){
                all+=b.size()-bcommon;
                break;
            }else{
                long ai = a.get(aindex++);
                all++;
                if(b.contains(ai)){
                    bcommon++;
                    common++;
                }
            }
        }
        System.out.println((double)common/all);

    }

}
