public class diamond {
    public static void main(String[] args) {
        int n=5;
        for (int row=0;row<2*n;row++){
            int totatcol=row > n ? 2 * n - row : row;
            int noOfspaces=n-totatcol;
            for(int s=0;s<noOfspaces;s++){
                System.out.print(" ");
            }
            for (int col=0;col<totatcol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
