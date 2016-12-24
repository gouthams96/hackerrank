import java.util.Scanner;
public class SumvsXOR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
         if(n>0){
              //calculating number of zeroes
              long x= Long.toBinaryString(n).length()-Long.bitCount(n);
              System.out.println((long)Math.pow(2,x));
           }else{
               System.out.println(1);
           }
    }
}
