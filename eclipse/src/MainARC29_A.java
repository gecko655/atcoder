import java.util.*;
public class MainARC29_A {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] yaku = new int[2];
        int n = s.nextInt();
        List<Integer> niku = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            niku.add(s.nextInt());
        }
        Collections.sort(niku);
        Collections.reverse(niku);
        while(!niku.isEmpty()){
            if(yaku[0]<=yaku[1]){
                yaku[0]+=niku.get(0);
            }else{
                yaku[1]+=niku.get(0);
            }
            niku.remove(0);
        }
        System.out.println(Math.max(yaku[0], yaku[1]));
    }
 
}