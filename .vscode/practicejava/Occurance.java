import java.util.*;
public class Occurance{
    public static int first=-1;
    public static int last =-1;
    public static void getindices(String str , char ele,int idx){
        if(idx==str.length()){
            return;
        }
        if(str.charAt(idx)==ele){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
            
        }
        getindices(str, ele, idx+1);
    }
    public static void main(String args[]) {
       // StringBuilder str=new StringBuilder("abcdddegfhaa");
       String str="tabcdfghijakkk";
        char ele='a';
        getindices(str, ele, 0);
        System.out.println("the firsr occurance"+first);
        System.out.println("the last occurance "+last);
    }

}