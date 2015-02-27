import java.util.*;
public class MainABC14_c {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a.add(s.nextInt());
            b.add(s.nextInt());
        }
        int[] scores = new int[1000002];
        for(int aa: a){
            scores[aa]++;
        }
        for(int bb: b){
            scores[bb+1]--;
        }
        int color=0;
        int ret =0;
        for(int score: scores){
            color+=score;
            if(ret<color){
                ret=color;
            }
        }
        System.out.println(ret);

    }


}
