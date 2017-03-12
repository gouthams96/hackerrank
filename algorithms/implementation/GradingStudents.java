import java.io.BufferedReader;
import java.io.InputStreamReader;
public class GradingStudents {
     public static int roundGrade(int currentGrade){
       int grade = currentGrade;
       if(currentGrade<38 || currentGrade%5 == 0){
          return currentGrade;
       }
        int limit = 0;
        while(limit<3){
            if ((currentGrade) % 5 == 0){
                return currentGrade;
            }
            currentGrade++;
            limit ++;
        }
        return grade;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase>0){
            int grade = Integer.parseInt(br.readLine());
            System.out.println(roundGrade(grade));
            testCase--;
        }
    }
}
