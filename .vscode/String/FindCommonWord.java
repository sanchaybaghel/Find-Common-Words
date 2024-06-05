
import java.util.*;
public class FindCommonWord {
    public static void main(String[] args) {
        String[] words={"bella","label","hello"};
        System.out.println(commonChars(words));
          
        
    }
    public static List<String> commonChars(String[] words) {
        int[] freq=new int[26];
        Arrays.fill(freq,Integer.MAX_VALUE);
        for(String word:words){
            int[] charfreq=new int[26];
            for(char ch:word.toCharArray()){
                charfreq[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                freq[i]=Math.min(freq[i],charfreq[i]);
            }
        }
        List<String> result=new ArrayList<>();
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i];j++){
                result.add(String.valueOf((char)(i+'a')));
            }
        }
        return result;
        
    }

}
