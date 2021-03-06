package jsk;

import java.util.Arrays;

/**
 * Created by Wean on 2017/8/30.
 */
public class NodeAdd {
    public static int removeElement(int[] nums, int val) {

        if(nums==null||nums.length == 0)
            return 0;

        int len = 0;
        for(int i =0; i < nums.length;i++){
            if(nums[i] != val){
                if(nums[len]!=nums[i])
                    nums[len]=nums[i];
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int k[]=new int[]{3,2,5,4,9,8,8,6,2,3};
        System.out.println(removeElement(k,3));
        for (int i = 0; i < removeElement(k, 3); i++) {
            System.out.print(k[i]+",");
        }
    }
}
