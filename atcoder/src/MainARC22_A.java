

import java.util.Scanner;

public class MainARC22_A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toLowerCase().toCharArray();
		sc.close();
		int i=0;
		for(;i<str.length;i++){
			if(str[i]=='i') break;
		}
		for(;i<str.length;i++){
			if(str[i]=='c') break;
		}
		for(;i<str.length;i++){
			if(str[i]=='t') {
				System.out.println("YES");
				return;
			}
		}
        System.out.println("NO");


	}

}
