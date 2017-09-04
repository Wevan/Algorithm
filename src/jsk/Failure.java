package jsk;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Wean on 2017/5/13.
 */
public class Failure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        float sum=1;
        float[] n=new float[]{};
        float ss;

        while (sc.hasNextFloat()){
            ss=sc.nextFloat();

                if (ss>3&&ss<1000000000){
                    for (int k=0;;k++){
                        if (ss-k>0){
                            break;
                        }

                        sum=(i+1)/(ss-k)*sum;
                    }
                    sum = ((ss - 3) / 4) * sum;
                    System.out.printf("%.12f",sum);
                    sum=1;
                }
            }



        }
//        for (int j = 0; j < n.length; j++) {
//            if (n[j]>3&&n[j]<1000000000){
//                for (int k=0;;k++){
//                    if (n[j]-k>0){
//                        break;
//                    }
//
//                    sum=(i+1)/(n[j]-k)*sum;
//                }
//                sum = ((n[j] - 3) / 4) * sum;
//                System.out.printf("%.12d",sum);
//            }
//        }
//    }
}
