import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class MigratoryBirds {


    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> birds = new HashMap<Integer,Integer>(); 
        int totalBirds = Integer.parseInt(br.readLine());
        int[] type = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int birdType : type){
                if(birds.get(birdType) == null){
                birds.put(birdType,1);
                }else{
                    birds.put(birdType,(birds.get(birdType)+1));
                }
            }
            Object[] collections = birds.keySet().toArray();
            Arrays.sort(collections);
            int key =0;
            int value=0;
            int i=0;
            boolean check = true;
            int total=collections.length;
            while(total>0){
                if(check){
                    key = (int) collections[i];
                    value = birds.get(key);
                    check = false;
                }else if(value<(birds.get(collections[i]))){
                    key = (int) collections[i];
                    value = birds.get(key);
                }
                i++;
                total--;
            }   
        System.out.println(key);
    }
}
