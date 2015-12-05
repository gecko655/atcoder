import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.LongStream;

/*
 * WA
 */
public class MainThanks2015_G {
    public static long[] costs;
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int m = sc.nextInt();
            costs = new long[n];
            Arrays.fill(costs, Long.MAX_VALUE);
            List<Set<Road>> edges = new ArrayList<>();
            for(int i=0;i<n;i++)
                edges.add(new HashSet<>());
            for(int i=0;i<m;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                long c = sc.nextLong();
                long t = sc.nextLong();

                edges.get(a-1).add(new Road(b-1,c,t));
                edges.get(b-1).add(new Road(a-1,c,t));
            }
            costs[0]=0;
            solve(edges,0,1);
            System.out.println(costs[n-1]);
            LongStream.of(costs).forEach(System.out::println);
        }
    }


    private static void solve(List<Set<Road>> edges, int start, long color) {
        Set<Road> roads= edges.get(start);
        for(Road r: roads){
            long newcost = costs[start]+r.cost+Math.abs(r.color-color);
            System.out.println(start+","+r.dest+","+color+","+costs[start]+","+(costs[r.dest]>newcost));
            if(costs[r.dest]>newcost){
                costs[r.dest] = newcost;
                LongStream.of(costs).forEach(c ->System.out.print(c+","));
                System.out.println();
                solve(edges,r.dest,r.color);
            }
        }

    }

}
class Road{
    public int dest;
    public long color;
    public long cost;
    public Road(int dest, long color, long cost) {
        this.dest = dest;
        this.color = color;
        this.cost = cost;
    }
}
