import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EqualizetheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> a = new HashMap<Integer,Integer>();
        int n = in.nextInt();
        while(n>0){
            int temp = in.nextInt();
            Integer frequency= a.get(temp);    
            if(frequency == null){
                a.put(temp, 1);
            }else{
                a.put(temp, frequency+1);
            }
            n--;
        }
         int largest=0;
         int sum=0;
         for(Integer f : a.values()){
             if(f>largest){
                 largest=f;
             }
             sum+=f;
         }
        System.out.println(sum-largest);
    }
}
