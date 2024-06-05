import  java.util.*;
public class Recursion_factorial {
    public static int calcfactorial(int n) {
        if(n==1||n==0){
            return 1;
        }
        int fact_nm1=calcfactorial(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;

        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=calcfactorial(n);
        System.out.println("ans"+ans);
    }
}
