public class Recursion_pow {
    public static int calcPow(int x ,int n) {
        if(n==0){
            return 1;
        }
        if(x==1){
            return 0;
        }
        int xpownm1=calcPow(x,n-1);
        int xpown= x * xpownm1;
        return xpown;
        
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=calcPow(x,n);
        System.out.println(ans);
    }
}
