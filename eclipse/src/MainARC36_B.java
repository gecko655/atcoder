import java.util.*;
public class MainARC36_B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean climb = true;
        int last = 0;
        int maxheight = 0;
        int height = 0;
        for(int i=1;i<=n;i++){
            int h = s.nextInt();
            if(h>last&&climb){
                height++;
            }else if(h<last&&climb){
                height++;
                climb=false;
            }else if(h>last&&!climb){
                climb=true;
                maxheight = Math.max(maxheight, height);
                last = h;
                height=2;
                continue;
            }else if(h<last&&!climb){
                height++;
            }
            maxheight = Math.max(maxheight, height);
            last = h;
        }
        System.out.println(maxheight);
        

    }

}
