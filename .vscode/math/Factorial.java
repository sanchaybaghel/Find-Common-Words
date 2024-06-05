public class Factorial{
    public static void main(String[] args) {
        // int ans=fact1(5);
        int ans=fact2(5);

        System.out.println(ans);
    }
    private static int fact2(int n){
        int sum=0;
        int t=n;
        for(int i=0;i<n-2;i++){
            sum=0;
            for(int j=1;j<n-i;j++){
                sum=sum+t;
            }
            t=sum;   
        }
        return sum;

    }
    private static int fact1(int n){
        double fact=0.0;
        int i=2;

        while(i<=n){
            fact=fact+Math.log(i);
            i++;
        }
        double e=Math.E;
        int ans=(int)(Math.pow(e, fact))+1;
        return ans;
    }
}