import java.util.*;
public class Pallindrome{
    public static void main(String[] args) {
        System.out.print("enter number to check");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,r,c;
        c=n;
        while(n>0){
            r=n%10;
            s=r+(s*10);
            n=n/10;
        }
        if(c==s){
            System.out.println("no is pallindrome");

        }
        else{
            System.out.println("no is not pallindrome");
        }
    }
          
}