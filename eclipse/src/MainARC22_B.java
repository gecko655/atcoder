

import java.util.Scanner;

public class MainARC22_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] taste = new int[100001];
		
		int max=0;
		int lastIndex=0;
		for(int i=1;i<=N;i++){
			int a = sc.nextInt();
			if(taste[a]==0){
				taste[a]=i;
			}else{
                int len=i-lastIndex-1;
				if(len>max){
					max=len;
				}
                if(lastIndex<taste[a]){
                    lastIndex=taste[a];
                }
				taste[a]=i;
			}
		}
		int len =N-lastIndex;
        if(len>max){
            max=len;
        }

		System.out.println(max);
		
	}

}
