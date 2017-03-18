import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class BreakingtheRecords{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numberOfGames = Integer.parseInt(br.readLine());
    int highScoreTimes=0, lowScoreTimes=0;
    int[] scores = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
    int scoreH = scores[0];
    int scoreL = scores[0];
    for (int i=0;i<scores.length-1;i++) {
      if(scores[i+1]>scoreH){
        scoreH = scores[i+1];
        highScoreTimes++;
      }else if(scores[i+1]<scoreL){
        scoreL = scores[i+1];
        lowScoreTimes++;
      }
    }
    System.out.println(highScoreTimes+" "+lowScoreTimes);
  }
}
