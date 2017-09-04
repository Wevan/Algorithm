package jsk;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Wean on 2017/8/29.
 */
public class Longest {
    public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        String acc="";

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            map.put(strs[i].length(), strs[i]);
        }
        Set set = map.keySet();
        for (Object key : set) {
            acc = map.get(key);
            break;
        }
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(acc)){
                i=-1;
                System.out.println("i="+i+" "+acc);
                acc=acc.substring(0,acc.length()-1);

            }
            if (acc.length()==0){
                break;
            }
            if ((acc.length()!=0)&&(i==strs.length-1)){
                ans=acc;

            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"qasdgh","asd","asdfff"
        };

        System.out.println(longestCommonPrefix(strings));
    }
}
