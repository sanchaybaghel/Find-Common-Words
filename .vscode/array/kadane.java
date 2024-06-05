public class kadane {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadanes(arr));

    }
    public static int kadanes(int[] arr)
    {
        int sum=arr[0];
        int maxsum=arr[0];
        for (int i = 0; i < arr.length; i++) {
           
            if(sum>=0)
            {
                sum=sum+arr[i];
            }
            else
            {
                sum=arr[i];
            }
            
            if (sum>maxsum) {
                maxsum=sum;

            }
            
        }
        return maxsum;
    }
}
