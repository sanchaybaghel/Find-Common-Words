public class Strictlyincreasing {
    public static boolean checkifincreasing(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(!checkifincreasing(arr, idx+1)){
            return false;
        }
        return arr[idx]<arr[idx+1];
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,6,5,8,9};
        if(checkifincreasing(arr2, 0)){
            System.out.println("array is increasing");
        }else{
            System.out.println("array is not strictly incresing");
        }

    }
}
