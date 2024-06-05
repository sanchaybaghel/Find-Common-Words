public class Onescomplement {
    public static void main(String[] args) {
        int num=10;
        convert(num);
    }
    public static void convert(int num){
        int i=0;
        int rem=0;
        int[] ans=new int[10];
        while (num!=1) {
            rem=num%2;
            ans[i]=rem;
            num=num/2;
            i++;
        }
        ans[i]=1;
        for(int j=0;j<ans.length;j++){
            if(ans[j]==0){
                ans[j]=1;
                continue;
            }
            if(ans[j]==1){
                ans[j]=0;
                
            }
        }
    }
}
