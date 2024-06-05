package sort;

import java.util.Arrays;

public class Mergesorting {
     public static void main(String[] args) {
        int[] arr={5,4,2,3,1};
        arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static int[] mergesort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int m=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr, 0,m));
        int[] right=mergesort(Arrays.copyOfRange(arr,m,arr.length));
        return merge(left,right);

    }
    private static int[] merge(int[] left,int[] rigth){
        int[] mix=new int[left.length+rigth.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<rigth.length)
        {
           if(left[i]<rigth[j])
           {
            mix[k]=left[i];
            i++;
           }
           else{
            mix[k]=rigth[j];
            j++;
           }
           k++;
        }
        while(i<left.length)
        {
            mix[k]=left[i];
            i++;
            k++;
        }
         while(j<rigth.length)
        {
            mix[k]=rigth[j];
            j++;
            k++;
        }
        return mix;
    }

    
}
