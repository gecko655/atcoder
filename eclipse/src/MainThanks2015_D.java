import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainThanks2015_D {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            List<Integer> scores = new ArrayList<>();
            int n = sc.nextInt();
            Map<Integer,List<Integer>> knownList = new HashMap<>();
            int sumScore =0;
            for(int i=0;i<n;i++){
                int s = sc.nextInt();
                scores.add(s);
                sumScore += s;
                knownList.put(i, new ArrayList<>());
            }
            int m = sc.nextInt();
            for(int i=0;i<m;i++){
                switch(sc.nextInt()){
                    case 0:
                        knownList.get(sc.nextInt()-1).add(sc.nextInt()-1);
                        break;
                    case 1:
                        int me =sc.nextInt()-1;
                        int target =sc.nextInt()-1;
                        List<Integer> kl = knownList.get(me);
                        if(kl.contains(target)){
                            System.out.println(scores.get(target)+" "+scores.get(target));
                        }else{
                            int unknownNum = n-kl.size()-1-1;//me and target
                            int otherScore = scores.get(me);
                            for(int other: kl){
                                otherScore+=scores.get(other);
                            }
                            System.out.println(Math.max(0,sumScore-otherScore-unknownNum*100)+" "+Math.min(100, sumScore-otherScore));
                        }
                        
                        break;
                }
            }
        }
    }
}
