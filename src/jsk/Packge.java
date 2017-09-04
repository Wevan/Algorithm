package jsk;

/**
 * Created by Wean on 2017/4/5.
 */
public class Packge {
   static  int a[][]=new int[][]{{11,3},{8,12},{11,17},{16,13},{1,14},{2,8},{6,10},{10,18},{17,11},{10,15},{6,14},{5,6},{2,19},{19,10},{4,9},{7,9},{5,14},{5,20},{15,19},{3,17},{15,11},{7,25},{11,20},{9,12},{17,4},{9,19},{4,18},{10,10},{12,19},{17,3},{19,9},{20,16},{11,16},{10,2},{20,15},{3,14}};
    static int count=0;

    public static int max(int i, int j){
        return i>=j?i:j;
    }
    public static int  dfs(int num,int index,int width){
        if (width==100){
            if (count<num){
                count=num;
            }
            return 0;
        }
        if (width>100||index==36){
            return 0;
        }
        if (a[index][1]<=20){
            max(dfs(num+1,index+1,width+a[index+1][0]),dfs(num,index+1,width));
        }
        return count;
    }

    public static void main(String[] args) {
        dfs(0,0,0);
        System.out.println(count);
    }
}
