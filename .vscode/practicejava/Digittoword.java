import java.util.*;
public class Digittoword{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   int revn=0,rem;
    int digit=sc.nextInt();
    String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    while(digit!=0){
        int num=digit%10;
        System.out.println(arr[num]);
        rem=digit%10;
         
           revn=revn*10+rem;
           digit=digit/10;

       
    }
          System.out.println(revn);
    
    while(revn!=0){
       
            int num=revn%10;
            System.out.println(arr[num]);
            
            revn=revn/10;


       
        

        
        
   }

}
}