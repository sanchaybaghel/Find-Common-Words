import java.util.*;
public class Twodarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[] [] numbers=new int[rows] [cols];
        // for input
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();

            }
        }
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++){
                System.out.print(numbers[i][j] +" ");

            }
            System.out.println();
        }
        


        
        
    }
}