import java.util.Scanner;

public class MainThanks2015_E_revised {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            long q = sc.nextLong();
            for(int i=0;i<q;i++){
                String s = sc.next();
                String t = sc.next();
                solve(s,t);
            }
        }
    }

    private static void solve(String s, String t) {
        char[] scs = s.toCharArray();
        String replacedS = "";
        for(char sc: scs)
            if(t.contains(sc+""))
                replacedS+=sc;
        if(replacedS.contains(t))
            System.out.println("YES");
        else
            System.out.println("NO");


    }
}
