import java.util.*;
public class Recursion {
     public static void printnumb(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        printnumb(n+1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int no=sc.nextInt();
       
       int n = sc.nextInt();
        int sum=0;
    //    for(int i=1;i<n+1;i++){
    //     sum=sum+i;
    //    }
    //    System.out.println(sum);
        printnumb(n+1);
        
     }
}
