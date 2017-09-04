package jsk;

/**
 * Created by Wean on 2017/8/28.
 */
public class Fanzhuan {
    public int reverse(int x) {
        boolean f = x < 0;
        long a = x;
        StringBuilder sb = new StringBuilder();
        a = a < 0 ? -a : a;
        sb.append(a);
        long out = f ? -Long.parseLong(sb.reverse().toString()) : Long.parseLong(sb.reverse().toString());
        if (out >= Integer.MAX_VALUE || out <= Integer.MIN_VALUE) {
            return 0;
        }
        return (int) out;
    }

    public static void main(String[] args) {
        System.out.println(new Fanzhuan().reverse(1534236469));
    }
}
