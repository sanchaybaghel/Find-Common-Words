import java.util.*;
public class AchocolateF {

    public static void main(String[] args) {
        int[] arr={4,5,0,1,8,9,0,5,0,0};
        setzerosatend(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void setzerosatend(int[] arr){
       int j=0;
       for (int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[j]=arr[i];
            j++;
        }
       }
       for(int i=j+1;i<arr.length;i++){
        arr[i]=0;
       }
    }
}
