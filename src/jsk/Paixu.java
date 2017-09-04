package jsk;

/**
 * Created by Wean on 2017/4/7.
 */
public class Paixu {
    public static long[] jic=new long[20];
    static long  jc(int n){
        if (n==1||n==0) return 1;
        return n*jc(n-1);
    }
    static void jcb(){
        for (int i = 1; i < 18; i++) {
            jic[i]=jc(i);
        }
    }
    public static long  kangtuo(int[] b,int n){
        long num=0;
        for (int i = 0; i < n; i++) {
            int tem=0;
            for (int l = i+1; l < n; l++) {
                if (b[l]<b[i]){
                    tem++;
                }
            }
            num+=tem*jic[n-i-1];
        }
        return num;
    }
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int b[]=new int[]{2,3,11,6,17,12,1,10,8,5,13,7,9,15,4,14,16};
        int c[]=new int[]{3,2,1};
        jcb();
        System.out.println(kangtuo(b,17));
    }
}
