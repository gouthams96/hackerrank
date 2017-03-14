import java.util.Scanner;
public class DrawingBook {
    public static int numberOfTurns(int page, int totalPage){
        if(page>totalPage/2){
            return (totalPage - page)/2 ;
        }else{
            return page/2;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        System.out.println(numberOfTurns(p,n));
    }
}
