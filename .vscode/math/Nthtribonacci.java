import java.util.Scanner;
public class Nthtribonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tribonacci(n));  
    }
    public static int tribonacci(int n){
       int t0=0,t1=1,t2=1;
       int sum=0;
       for(int i=2;i<n;i++){
        sum=t0+t1+t2;
        t0=t1;
        t1=t2;
        t2=sum;
       }
       return sum;
    }
}
