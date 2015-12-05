import java.util.Scanner;

public class MainThanks2015_E {
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
        char[] sca = s.toCharArray();
        String gotString="";
        for(char sc: sca){
            if(sc==t.charAt(gotString.length())){
                gotString+=sc;
            }else if(t.contains(sc+"")){
                gotString=t.charAt(0)==sc?""+sc:"";
            }
            if(gotString.equals(t)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
