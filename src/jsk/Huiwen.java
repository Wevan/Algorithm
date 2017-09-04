package jsk;

/**
 * Created by Wean on 2017/8/28.
 */
public class Huiwen {
    public boolean isPalindrome(int x) {
        boolean a = false;
        String b = String.valueOf(x);
        char[] c = b.toCharArray();
        int k = c.length;
        int i;

        for (i = 0; i < c.length / 2; i++) {
            if (c[i] != c[k - i-1]) {
                break;
            }
        }
        if (i==k/2){
            a=true;
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(new Huiwen().isPalindrome(11321));
    }
}
