import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
public class Gemstones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Character> rock = new HashSet<Character>();
        Map<Character,Integer> elements = new HashMap<Character,Integer>();
        int testCase = in.nextInt();
        int iter=testCase;
        while(testCase>0){
            String rocks = in.next();
            for(int i=0;i<rocks.length();i++){
                rock.add(rocks.charAt(i));
            }
            for(Character gem: rock){
              Integer frequency = elements.get(gem);
              if(frequency == null){
                  elements.put(gem, 1);
              }else{
                  elements.put(gem, frequency+1);
              }
            }
            rock.clear();
            testCase--;
        }
        int gemFound=0;
        for(Integer found : elements.values()){
            if(found == iter){
                gemFound++;
            }
        }
        System.out.print(gemFound);
    }
}
