import java.util.*; 
public class Function {
    public static void prac(int a,int b) {
        int s=a+b;
        String sum="sum is";
        System.out.println(sum+s);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int s;
        // int a=6;
        // int b=8;
        prac(a,b);
    }
}
