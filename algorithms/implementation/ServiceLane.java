import java.util.Scanner;

/**
 *
 * @author Goutham S
 */
public class  ServiceLane{
    public static int findMininum(int[] array,int start,int end){
    int minimum=3;
    for (int i=start;i<=end;i++) {
      if(array[i] < minimum){
        minimum = array[i];
      }
    }
    return  minimum;

  }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int test=in.nextInt();
    int[] widthArray = new int[n];
    for (int i=0;i<n;i++) {
      widthArray[i] = in.nextInt();
    }

    while(test>0){
      int start;
      int end;
      start = in.nextInt();
      end = in.nextInt();
      int vehicle = findMininum(widthArray,start,end);
      System.out.println(vehicle);
      test--;
    }

  }
}
