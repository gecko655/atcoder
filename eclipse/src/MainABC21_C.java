import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class MainABC21_C {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int m = s.nextInt();
        int[][] road = new int[m][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++)
                road[i][j]= s.nextInt();
        }
        
        long[] numShortestPath = new long[n+1];
        Arrays.fill(numShortestPath, 0);
        numShortestPath[a]=1;
        Set<Integer> now = new HashSet<>();
        now.add(a);
        Set<Integer> done = new HashSet<>();
        done.add(a);
        
        while(!done.contains(b)){
            Set<Integer> next = new HashSet<>();
            for(int i: now){
                for(int[] r: road){
                    int t;
                    if(r[0]==i){
                        t=r[1];
                    }else if(r[1]==i){
                        t=r[0];
                    }else{
                        continue;
                    }
                    if(done.contains(t)){
                        continue;
                    }
                    next.add(t);
                    numShortestPath[t]+=numShortestPath[i];
                }
            }
            done.addAll(next);
            now = new HashSet<>(next);
        }
        System.out.println(numShortestPath[b]%1_000_000_007);
        
    }

}
