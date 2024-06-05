package String;
import java.util.*;

import java.util.ArrayList;

public class Stream {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subsetDuplicate(arr);

       for (List<Integer> list : ans) {
        System.out.println(list);
        
       }
        // System.out.println(subseqRet("","   abc"));
       
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    

    static String skip(String up)
    {
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else{
            return ch + skip(up.substring(1));
        }
    }
    static String skipapple(String up)
    {
        if(up.isEmpty()){
            return "";
        }
        
        if(up.startsWith("apple")){
            return skipapple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }
    static ArrayList<String> subseqRet(String p,String up)
    {
         if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
         }
         char ch=up.charAt(0);
         ArrayList<String> left=subseqRet(p+ch, up.substring(1));
         ArrayList<String> right=subseqRet(p, up.substring(1));
         left.addAll(right);
         return left;
    }
    static List<List<Integer>> subset(int[] arr)
    {
       
         List<List<Integer>> outer =new ArrayList<>();
         outer.add(new ArrayList<>());
         
         for (int nums : arr) {
            int n=outer.size();
           
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
         }
        
         return outer;
         
    }
    static List<List<Integer>> subsetDuplicate(int[] arr)
    {
        Arrays.sort(arr);
         List<List<Integer>> outer =new ArrayList<>();
         outer.add(new ArrayList<>());
         int start=0;
         int end=0;
         for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1])
            {
                start=end+1;

            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
         }
         
        
        
         return outer;
         
    }
}









