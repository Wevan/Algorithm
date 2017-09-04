package jsk;

/**
 * Created by Wean on 2017/4/7.
 */
public class Suanshi {

    public static void main(String[] args) {
        for(int i = 100;i<=999;i++){
            for(int j = 100;j<=999;j++){
                int[] f = new int[10];
                int a = i*(j%10);
                int b = i*(j/10%10);
                int c = i*(j/100);
                if(a>=1000||b>=1000||c>=1000||i*j>=100000||a<100||b<100||c<100)continue;
                //i,j,a,b,c,i*j
                if(check(i,f)&&check(j,f)&&check(a,f)&&check(b,f)&&check(c,f)&&check(i*j,f)){
                    System.out.println(i+" "+j+" "+a+" "+b+" "+c+" "+i*j);
                }
            }
        }
    }
    public static boolean check(int i,int[] f){

        while(i>0){
            if(f[i%10]==2){
                return false;
            }
            f[i%10]++;
            i/=10;
        }
        return true;
    }
}
