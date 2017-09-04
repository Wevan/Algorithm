package jsk;

import java.util.Scanner;

/**
 * Created by Wean on 2017/4/7.
 */
public class Huankuan {
    static double shengyu;
    public static double ans(double r,int q) {
        double zuixiao = 10000 / q;
        double jiejin = 10000;
        double cunzuixiao = 0;
        for (; true; zuixiao +=0.01) {
            shengyu=10000;
            for (int i = 0; i < q; i++) {
                shengyu =  r * shengyu / 12.0 /100+ shengyu - zuixiao;
            }

            if (Math.abs(shengyu) < Math.abs(jiejin)) {
                jiejin = shengyu;
                cunzuixiao = zuixiao;
            } else if (Math.abs(shengyu) == Math.abs(jiejin)) {
                if (shengyu > jiejin) {
                    jiejin = shengyu;
                    cunzuixiao = zuixiao;
                }
            }
            if (shengyu<0)break;
        }
        return cunzuixiao;
    }
    public static int a(){
        int b=0;
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=100*ans((scanner.nextDouble()),scanner.nextInt());
        while ((a)%1>0.5){
            System.out.println((int)(a+1));
            return;
        }

        System.out.println(a);

    }
}
