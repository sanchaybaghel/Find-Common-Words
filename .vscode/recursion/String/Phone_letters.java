package String;

import java.util.*;

public class Phone_letters {
    public static void main(String[] args) {
       
        System.out.println(pad("", "789"));
       

    }

    static ArrayList<String> pad(String p, String up) {
        
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
       
        if (digit < 7) {
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i - 3);
                list.addAll(pad(p + ch, up.substring(1)));
            }
        } else if (digit == 7) {
            for (int i = (digit - 1) * 3; i <= digit * 3; i++) {
                char ch = (char) ('a' + i - 3);
                list.addAll(pad(p + ch, up.substring(1)));
            }
        } else if (digit == 8) {

            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i - 2);
                list.addAll(pad(p + ch, up.substring(1)));
            }
        }

        else if (digit == 9) {

            for (int i = (digit - 1) * 3; i <= digit * 3; i++) {
                char ch = (char) ('a' + i - 2);
                list.addAll(pad(p + ch, up.substring(1)));
            }
        }

        return list;

    }

}
