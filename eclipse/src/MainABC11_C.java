import java.util.*;
public class MainABC11_C {
    static List<Integer> ngs;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ngs = new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            ngs.add(s.nextInt());
        }
        Collections.sort(ngs);
        if(!ngs.contains(n)&&recur(0,n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    private static boolean recur(int i, int n) {
        if(n<=0) 
            return true;
        if(i>=100)
            return false;
        if(!ngs.contains(n-3))
            return recur(i+1,n-3);
        if(!ngs.contains(n-2))
            return recur(i+1,n-2);
        if(!ngs.contains(n-1))
            return recur(i+1,n-1);
        return false;
                
    }

}
