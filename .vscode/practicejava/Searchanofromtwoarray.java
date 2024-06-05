import java.util.*;
public class Searchanofromtwoarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] numbers=new int[rows] [cols];
        int i,j;
        //input
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();

            }
        }
        //output
        int x=sc.nextInt();
        for(i=0;i<rows;i++){
            for(j=0;j<cols;j++){
                //compare with x
                if(numbers[i][j]==x){

                    System.out.print("no found at loc("+i+","+j+")");
                }
                
                

            }
            
        }
        

    }
    
}
