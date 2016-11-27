import java.io.*;
import java.util.*;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxSize;
        int sum =0,arr=0;
        maxSize = in.nextInt();
        while(maxSize>0){
             arr = in.nextInt();
            sum = arr+sum;
            maxSize = maxSize - 1;
        }
        System.out.println(sum);
    }
}
