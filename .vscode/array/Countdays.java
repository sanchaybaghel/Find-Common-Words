import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Countdays {
    public static void main(String[] args) {
        int[][] meetings = {
            {2,4},  
            {1,3}           
        };
        int ans=countDays(5, meetings);
        System.out.println(ans);
    }
     public static int countDays(int days, int[][] meetings) {
        
        
        // Sort meetings by starting day
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int count=meetings[0][0]-1;
        int end=0;
        for(int[] meeting:meetings){
            int start=meeting[0];
            System.out.println("s "+start+"c "+count);
            
            if (end!=0) {
                if ((start-end-1)<0) {
                    count+=0;
                    System.out.println("count "+count);
                    
                }
                else{
                    count+=start-end-1; 

                }
                
               
                  
                System.out.println(""+count+""+end);       
            }
            end=meeting[1];
        }
        System.out.println(end);
        if(end<days){
            count+=days-end;
        }
       
        
        return count;
    }
}
