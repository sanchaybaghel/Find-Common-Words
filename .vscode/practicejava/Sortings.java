import java.util.*;
public class Sortings {
    public static void PrintArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }System.out.println();
        
    }
    public static void main(String[] args) {
        int temp;
        int arr[]={1,2,3,6,9,8,4,5,99};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }PrintArray(arr);

        }

    
}

