package jsk;

/**
 * Created by Wean on 2017/4/7.
 */
public class Tiank {
    static int compare(String s1, String s2)
    {
        if(s1==null && s2==null) return 0;
        if(s1==null) return -1;
        if(s2==null) return 1;

        if(s1.isEmpty() && s2.isEmpty()) return 0;
        if(s1.isEmpty()) return -1;
        if(s2.isEmpty()) return 1;

        char x = s1.charAt(0);
        char y = s2.charAt(0);

        if(x<y) return -1;
        if(x>y) return 1;

        int t = compare(s1.substring(1),s2.substring(1));
        if(t==0) return 0;

        return t>0?s1.indexOf(x):s2.indexOf(y); //填空位置
    }

    public static void main(String[] args)
    {
        System.out.println(compare("abc", "abk"));
        System.out.println(compare("abc", "a"));
        System.out.println(compare("abcde", "abcda"));
    }
}
