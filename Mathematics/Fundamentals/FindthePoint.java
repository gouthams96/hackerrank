import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class FindthePoint {
    public static void main(String[] args) throws Exception {     
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase > 0){
            int[] array = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(((2*array[2])-array[0])+" "+((2*array[3])-array[1]));
            testCase--;
        }
        
    }
}
