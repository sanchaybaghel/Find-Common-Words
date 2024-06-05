import java.util.*;
public class Recursiontow{
    public static void tow(int n,String src,String helper,String dest) {
        if(n==1){
            System.out.println("transfer sisk "+ n + "from" +src + "to" + dest);
            return;
        }
        tow(n-1,src,dest,helper);
        System.out.println(" transfer " + n + " from " + src +" to "+ dest);
        tow(n-1,helper,src,dest);
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    tow( n , " s "," h "," d ");
    
   }
}