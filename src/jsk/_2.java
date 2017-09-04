package jsk;

/**
 * Created by Wean on 2017/4/1.
 * /
 * <p>
 * /*
 * \displaystyle \left\{\begin{aligned}11x + 13y + 17z = 2471 \\13x + 17y + 11z = 2739\end{aligned}\right.{
 * ​11x+13y+17z=2471
 * ​13x+17y+11z=2739
 * ​
 * 已知 xx，yy，zz 均为正整数，请你计算 xx，yy，zz 相加和最小为多少。
 */

public class _2 {
    public static void main(String[] args) {
        int temp=9000;
        for(int x = 1; x <= 2739/11;x++)
        {
            for(int y = 1; y <= 2739/13; y++)
            {
                for(int z = 1; z <= 2739/11; z++)
                {
                    if(11*x+13*y+17*z==2471&&13*x+17*y+11*z==2739)
                    {
                        if(x+y+z<=temp)
                        {
                            temp = x+y+z;
                        }
                    }
                }
            }
        }
        System.out.println(temp);
    }
}
