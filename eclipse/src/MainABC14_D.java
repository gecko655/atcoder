import java.util.*;
public class MainABC14_D {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();
        Map<Integer,Integer> v = new HashMap<Integer,Integer>();
        List<Integer> next = new ArrayList<Integer>();
        List<Integer> tmpNext = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            x.add(s.nextInt());
            y.add(s.nextInt());
        }
        int Q = s.nextInt();
        if(Q!=1){
            return;
        }
        int a = s.nextInt();
        int b = s.nextInt();
        v.put(a,0);
        next.add(a);
        for(int score=1;!v.containsKey(b);score++){
            for(int i=0;i<n-1;i++){
                int xx = x.get(i);
                int yy = y.get(i);
                if(xx==-1){
                    continue;
                }
                if(next.contains(xx)){
                    v.put(yy, score);
                    tmpNext.add(yy);
                    x.set(i, -1);
                }else if(next.contains(yy)){
                    v.put(xx, score);
                    tmpNext.add(xx);
                }
            }
            next = tmpNext;
        }
        System.out.println(v.get(b)+1);
    }


}
