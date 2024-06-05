public class starINno {

    public static void main(String[] args) {
        int n=5;
        for (int row=0;row<n;row++){
            int noOfspaces=n-row;
            for(int s=0;s<noOfspaces;s++){
                System.out.print(" ");
            }
            for (int col=row;col>=1;col--){
                System.out.print(col);
            }
            for (int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}