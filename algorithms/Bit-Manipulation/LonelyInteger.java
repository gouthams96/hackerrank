import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonelyInteger {
     private static int lonelyInteger(int[] a) {
       int arraySize = a.length;
       int[] counterArray = new int[arraySize];
       if(arraySize == 1 ){

         return a[0];

       }else{
         Arrays.sort(a);
         for (int i=0;i<arraySize;i++) {
              counterArray[i] = 0;
              for (int j=0;j<arraySize;j++) {
                if(a[i] == a[j]){
                  counterArray[i] += 1;
                }
              }
              if(counterArray[i] == 1){
                return a[i];
              }
         }
       }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}
