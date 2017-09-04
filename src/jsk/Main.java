package jsk;

/**
 * Created by Wean on 2017/5/13.
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int a, b;
        while (cin.hasNextInt())//重点在这里，此处命名为语句@1.
        {
            a = cin.nextInt();
            b = cin.nextInt();
            System.out.println(a + b);
        }
    }
}