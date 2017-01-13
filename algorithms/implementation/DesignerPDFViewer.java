import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Solution {

   public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int biggestHeight =0,height=0;
		int arr[] =Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		String word = br.readLine();
		for(char c:word.toCharArray()){
			height = Math.abs(((int)c)-97);
			if(arr[height]>biggestHeight){
				biggestHeight = arr[height];
			}
		}
		System.out.println(biggestHeight*(word.length()));
	}
}
