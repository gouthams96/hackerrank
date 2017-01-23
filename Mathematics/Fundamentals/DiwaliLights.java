import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class DiwaliLights {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine().trim());
        BigInteger lights = BigInteger.valueOf(2);
        while(testCase>0){          
            lights = lights.pow(Integer.parseInt(br.readLine().trim()));
            lights = lights.subtract(BigInteger.valueOf(1));
            System.out.println(lights.mod(BigInteger.valueOf((long)Math.pow(10,5))));
            lights = BigInteger.valueOf(2);
            testCase--;
        }
    }
}
