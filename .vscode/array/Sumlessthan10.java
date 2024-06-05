public class Sumlessthan10 {
    public static void main(String[] args) {
        int num=1234566;
        // findsum(num);
       
        int n=findsum(num);
        int target=findmin(n);
        System.out.println(target);

    }

    public static int findsum(int num)
    {
        int rev;
        int sum=0;
        while(num>0)
        {
            rev=num%10;
            sum=sum+rev;
            num=num/10;
        }
        
        if(sum>10){
            return findsum(sum);
        }
        return sum;

    }
    public static int findmin(int n){
        if(n<10){
            return n;
        }
        return findsum(n);
    }
}
