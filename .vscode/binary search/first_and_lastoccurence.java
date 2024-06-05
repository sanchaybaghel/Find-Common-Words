public class first_and_lastoccurence {
    public static void main(String[] args) {
        int[] nums={2,3,4,4,4,4,4,4,5,6,8};
        int target=4;
        System.out.println(seearchinrange(nums,4));

       
    }
    public static int[] seearchinrange(int[] nums,int target){
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }
        return ans;
    }
    public static int search(int[] nums,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
