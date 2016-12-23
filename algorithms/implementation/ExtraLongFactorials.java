import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      long n = in.nextLong();
      BigInteger fact = BigInteger.ONE;
      for(long i=n;i>=1;i--){
          fact = fact.multiply(BigInteger.valueOf(i));
    }
      System.out.println(fact);
    }
}
