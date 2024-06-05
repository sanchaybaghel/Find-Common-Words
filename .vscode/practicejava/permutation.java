//permutatio of a string
public class permutation {
    public static void StringPermutation(String prefix,String str) {
        int length=str.length();
        if(length==0){
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<str.length();i++){
            StringPermutation(prefix+str.charAt(i), str.substring(0, i)+str.substring(i+1,length));
        


        }
        
    }
    public static void main(String[] args) {
        String str="abc";
        StringPermutation("", str);
    }
}
