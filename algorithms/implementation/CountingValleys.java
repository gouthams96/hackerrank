import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class CountingValleys {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int size = Integer.parseInt(br.readLine());
      String s = br.readLine().trim();
      boolean upAgain = true;
      int valley=0;
      int step=0;
      for(char c: s.toCharArray()){
          if(c=='D'){
            step--;
          }
          if(c=='U'){
            step++;
          }
          if(step<0&&upAgain){
            valley++;
            upAgain=false;
          }
          if(step==0){
            upAgain=true;
          }
         }
        System.out.println(valley);

    }
}
