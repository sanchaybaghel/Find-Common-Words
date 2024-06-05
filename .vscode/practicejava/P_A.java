import java.util.*;
public class P_A {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(Pal(number)){
            System.out.println(number+"pallindrome");
        }
        else {
            System.out.println(number + " is not a palindrome.");
        }
        if (Arm(number)) {
            System.out.println(number + " is an Armstrong number.");
        } 
        else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean Pal(int number){
        int rn=0;
        int temp=number;
        while (number != 0) {
            int r = number % 10;
            rn = rn * 10 + r;
            number /= 10;
            return temp==rn;
        }
        return true;
    }
    public static boolean Arm(int number){
        int sum=0;
        int temp=number;
        while(number!=0){
            int r=number%10;
            sum=sum+(r*r*r);
            number/=10;
            return temp==sum;
        }
        return true;
    }

        
}
