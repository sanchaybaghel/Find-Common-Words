public class Recursion6 {
    public static void main(String[] args) {
        String str="sanchay";
        char temp;
        int n=str.length();
        char[] c=str.toCharArray();
        for(int i=0;i<n/2;i++){
            temp=c[i];
            
            
            c[i]=c[n-i-1];
            c[n-i-1]=temp;


        }
        

        
        System.out.println(c);
        
    }
}
