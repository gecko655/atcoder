import java.util.Arrays;
import java.util.Scanner;
public class MainARC38_B {

    static char[][] board = new char[1000][1000];
    static int[][] mem = new int[1000][1000];
    public static void main(String[] args) {
        try(Scanner s = new Scanner(System.in)){
            int h = s.nextInt();
            int w = s.nextInt();
            for(int i=0;i<h;i++){
                board[i] = (s.next()+"#").toCharArray();
            }
            Arrays.fill(board[h],'#');
            System.out.println(judge(0,0)?"First":"Second");
        }
    }
    
    private static boolean judge(int i,int j){
        if(board[i][j]=='#'){
            return true;
        }
        else if(mem[i][j]!=0)
            return mem[i][j]==1;
        mem[i][j]=-1;
        if(!judge(i+1,j)||!judge(i+1,j+1)||!judge(i,j+1)){
            mem[i][j]=1;
        }
        return mem[i][j]==1;
    }
}
