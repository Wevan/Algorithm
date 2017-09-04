package jsk;

import java.util.Arrays;

/**
 * Created by Wean on 2017/4/5.
 */
public class Maxnum {
    int ans[]=new int[13];
    boolean flag[]=new boolean[14];
    int sum=0;
    public void cal() {
        int temp1=ans[1]*ans[2]+ans[3]*ans[4];
        int temp2=ans[5]*ans[6];
        int temp3=ans[7]*ans[8]-ans[9]*ans[10];
        int temp4=ans[11]*ans[12];
        if((temp1==temp2)&&(temp3==temp4)) {
            sum++;
//            System.out.println(sum);
        }
    }
    public void dfs(int pos) {
        if(pos==13) {
            cal();
            return;
        }
        for(int i=1;i<=13;++i) {
            if(flag[i]==true) continue;
            flag[i]=true;
            ans[pos]=i;
            dfs(pos+1);
            flag[i]=false;
        }
    }

    public static void main(String[] args) {
//        int ans[]=new int[13];
//        boolean flag[]=new boolean[14];
//        int sum=0;
        Maxnum m=new Maxnum();
        Arrays.fill(m.ans,0);
        Arrays.fill(m.flag,false);
        m.dfs(1);
        System.out.println(m.sum);
    }

}
