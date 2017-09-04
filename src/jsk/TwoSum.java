package jsk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Wean on 2017/8/28.
 */
public class TwoSum {


    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a=new int[]{-3,4,3,0};
        int[] b=new TwoSum().twoSum(a,0);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}
