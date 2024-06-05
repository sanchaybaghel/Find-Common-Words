import java.util.*;
public class Arms_Palli{
    private static Object c;
    private static Object s;
    private static Object temp;
    private static Object sum;
    /**
     * @param n
     * @param s 
     */
    public static void Pallindrome(int n, Object s){
        while(n>0){
           int temp=n;
           int r=n%10;
           int sum=r+(sum*10);
            n=n/10;
        }
        Object c;
        if(temp==sum){
            System.out.println("no is pallindrome");
            
        }else{
            System.out.println("no not pallindrome");
        }
    }
    /**
     * @param n
     */
    public static void Armstrong(int n){
        while(n>0){
          int  c=n;
           int r=n%10;
           int s=s+(r*r*r);
            n=n/10;
        }
        if(c==s){
            System.out.println("no is Armstrong");

        }else{
            System.out.println("no not armstrong");
        }

    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c,s=0;
        int n=sc.nextInt();
        System.out.println("enter choice");
        int ch=sc.nextInt();
        switch (ch) {
            case 1 :Pallindrome(n);
                
                break;
                case 2 :Armstrong(n);
                break;
        
            default:
                break;
        }

        
        
    }
}