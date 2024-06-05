import java.util.*;
public class Recursion_fib {
    public static void printfib(int a,int b,int n) {
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfib(b,c,n-1);
        
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        //Scanner sc=new Scanner(System.in);
      //  int n=sc.nextInt();
        printfib(a,b,n-2);
    }
}
