// import java.util.*;
// // public class Practic{
// //      public static int arr[]={1,2,3,4,5};
// //      public static int max(){
// //         int i;
// //         int max = arr[0];
// //         for(i=1;i<arr.length;i++)
// //         {
// //             if(arr[i]>max)
// //             max=arr[i];
// //         }
// //         return max;
// //      }
// //      public static int min(){
// //         int i;
// //         int min = arr[0];
// //         for(i=1;i<arr.length;i++)
// //         {
// //             if(arr[i]<min)
// //             min=arr[i];
// //         }
// //         return min;
// //      }


// //     public static void main(String[] args) {
// //         int sum=min()+max();
// //         System.out.println(sum);
        
// //     }
// // }
// public class Practic{
//     // /**
//      * @param args
//      */
//     public static void main(String[] args) {
//         int count=0;
//         int i=1; 
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         while(i<=n){
//             if(n%i==0){
//                 count=count+1;
                
//             }i++;

//         }
//         if(count==2){
//             System.out.println("no is prime");
//         }
//         else{

//             System.out.println("no prime");
//         }
//     }

// }
// class Solution {
//     public long maximumTripletValue(int[] nums) {
//         int arr[]={12,6,1,2,7};
//          int great=(arr[0]-arr[1])*arr[2];
//         int num;
//         int f;
      
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=1;j<arr.length-1;j++)
//             {
//                 num=arr[i]+arr[j];
//                 for(int k=2;j<arr.length-1;k++)
//                 {
//                     f=num*arr[k];
//                     if(f>great)
//                     {
//                         great=f;
//                     }
//                 }
//             }
//         }
//         if(great<0)
//         {
//             return 0;
//         }
//             else
//             {
//                 return great;
//             }
        
        
//     }
// }
import java.util.*;

 public class Practic{
    public static void main(String[] args) {
      int[] arr={1,2,3};
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
       int n=list.size();
       System.out.println(n);
       for (int nums : arr) {
         System.out.println(nums);
       }
       
    }
 }