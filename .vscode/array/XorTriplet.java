import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class XorTriplet{
    public static void main(String[] args) {
        int[] nums={2,3,1,6,7,5,4};
        findtriplet(nums);
        System.out.println(findtriplet(nums));
        
    }
    public static int findtriplet(int[] nums){
        int ans=0;
        int xor=0;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            if(xor==0){
                ans+=i;
            }
            if(map.containsKey(xor)){
                for(int j:map.get(xor)){
                    ans+=(i-j-1);
                }
            }
            List<Integer> list=map.getOrDefault(xor, new ArrayList<Integer>());
            list.add(i);
            map.put(xor, list);
        }
        return ans;
    }
}