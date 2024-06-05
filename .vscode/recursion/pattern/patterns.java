package pattern;

public class patterns {
    public static void main(String[] args) {
        int n=5;
        pattern(5);
    }
    static void pattern(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        pattern(n-1);
        System.out.println(n);
    }
}
