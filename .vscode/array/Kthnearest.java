import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kthnearest {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4,5};
        System.out.println();
        List<Integer> list=new ArrayList<>();
        list=findClosestElements(arr,4,3);
        System.out.println(list);
       
        
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int num : arr) {
            int diff = Math.abs(num - x);
            List<Integer> elements = map.get(diff);
            if (elements == null) {
                elements = new ArrayList<>();
                map.put(diff, elements);
            }
            elements.add(num);
        }

        //  List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        //   entryList.sort(Map.Entry.comparingByValue());
        //   List<Integer> list=new ArrayList<>();
        //   for(int i=0;i<k;i++){
        //     list.add( entryList.get(i).getKey());
        //   }
        //   Collections.sort(list);
               List<Map.Entry<Integer, List<Integer>>> entries = new ArrayList<>(map.entrySet());
               Collections.sort(entries, new Comparator<Map.Entry<Integer, List<Integer>>>() {
                @Override
                public int compare(Map.Entry<Integer, List<Integer>> o1, Map.Entry<Integer, List<Integer>> o2) {
                    return o1.getKey().compareTo(o2.getKey());
                }
            });


       List<Integer> result = new ArrayList<>();
        int count = 0;
        for (Map.Entry<Integer, List<Integer>> entry : entries) {
            for (int num : entry.getValue()) {
                result.add(num);
                count++;
                if (count == k) {
                    break;
                }
            }
            if (count == k) {
                break;
            }
        }
        Collections.sort(result);
          return result;

        
    }

}
