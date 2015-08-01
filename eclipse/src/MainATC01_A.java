import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class MainATC01_A {
    static Stack<Point> points = new Stack<Point>();
    static Set<Point> visited  =new HashSet<Point>();

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int h =sc.nextInt();
            int w =sc.nextInt();
            char[][] field = new char[h+2][w+2];
            field[0] = new char[w+2];
            field[h+1] = new char[w+2];
            for(int i=0;i<=w+1;i++){
                field[0][i] = '#';
                field[h+1][i] = '#';
            }
            for(int j=1;j<=h;j++){
                field[j] = new char[w+2];
                field[j][0] = '#';
                field[j][w+1] = '#';
                char[] tmp = sc.next().toCharArray();
                for(int i=1;i<=w;i++){
                    field[j][i]=tmp[i-1];
                    if(tmp[i-1]=='s'){
                        points.add(new Point(j,i));
                        visited.add(new Point(j,i));
                    }
                }
            }

            while(!points.isEmpty()){
                Point p = points.pop();
                if(moveOne(field,p)){
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
            System.out.println("No");
        }
    }
    
    private static boolean moveOne(char[][] field, Point p) {
        return checkAndPush(field,p,-1,0)||
        checkAndPush(field,p,1,0)||
        checkAndPush(field,p,0,-1)||
        checkAndPush(field,p,0,1);
    }

    private static boolean checkAndPush(char[][] field, Point p, int dy, int dx) {
        if(field[p.y+dy][p.x+dx]=='g'){
            return true;
        }
        if(field[p.y+dy][p.x+dx]!='#'){
            Point np = new Point(p.y+dy,p.x+dx);
            if(visited.add(np)){
                points.add(np);
            }
        }
        return false;
        
    }

    static class Point{
        int y;
        int x;
        Point(int y,int x){
            this.y = y;
            this.x = x;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (!(obj instanceof Point))
                return false;
            Point other = (Point) obj;
            if (x != other.x)
                return false;
            if (y != other.y)
                return false;
            return true;
        }
    }
}
