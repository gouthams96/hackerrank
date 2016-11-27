import java.util.Scanner;

/**
 *
 * @author Goutham S
 */
public class FindDigits {
   
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int tests;
     int count=0;
     long temp;
     tests = in.nextInt();
     while(tests>0){
         long number = in.nextInt();
         temp = number;
         while(number >0){
             long last = number % 10;
             number = number /10;
             if(last !=0){
                 if(temp % last == 0){
                 count++;
                } 
             }              
         }
         System.out.println(count);
         count=0;
         tests--;
     }
         
  }
}
        

    

