import java.io.*;
import java.util.*;

public class Flippingbits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while(testCase>0){
            long[] numberInBinaryForm = new long[32];
            long number = scan.nextLong();
            String numberToBinary = Long.toBinaryString(number);
            for(int i=0;i<numberToBinary.length();i++){
                numberInBinaryForm[numberInBinaryForm.length-(numberToBinary.length()-i)] 
                        = Character.getNumericValue(numberToBinary.charAt(i));
                
            }
            String flipBinary = new String();
            for(int i=0;i<numberInBinaryForm.length;i++){
                flipBinary += numberInBinaryForm[i] !=0 ? 0 : 1;
            }
            System.out.println(Long.parseLong(flipBinary,2));     
            testCase--;
        }
        scan.close();
    }
}
