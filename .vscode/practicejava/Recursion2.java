import java.util.*;
public class Recursion2 {
    public static void printnumb(int i, int n, int sum) {
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printnumb(i+1,n,sum);
        
    }
    public static void main(String[] args) {
        Scanner jv=new Scanner(System.in);
        int n=jv.nextInt();
        printnumb(1,n,0);
    }
}
