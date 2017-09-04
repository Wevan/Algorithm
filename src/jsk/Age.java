package jsk;

/**
 * Created by Wean on 2017/4/7.
 */
public class Age {
    public static int j;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            for (j = 1800; j < 1900; j++) {
                if (i*i-i==j){
                    System.out.println(j);
                    break;
                }
            }
            if (i*i-i==j){
                break;
            }
        }
        System.out.println(j);
    }
}
