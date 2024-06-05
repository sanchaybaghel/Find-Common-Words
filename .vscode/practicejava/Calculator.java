import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int a,b,ch;
        System.out.println("enter the numbers ");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("enter operations");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1 : System.out.println(a+b);
        break;
        case 2 : System.out.println(a-b);
        break;
        case 3 : System.out.println(a*b);
        break;
        case 4 : System.out.println(a%b);
        break;
        case 5 : System.out.println("enter valid no");
    }





        
    }
}
