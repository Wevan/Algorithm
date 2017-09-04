package jsk;

import java.util.Stack;

/**
 * Created by Wean on 2017/8/29.
 */
public class Bracket {
    public boolean isValid(String s) {
        boolean flag = false;
        /**
         * 正确的表达有：
         * (){}[]
         * ({}[])
         * ({[]})
         * ({})[]
         * 1.异向异形的括号，正向括号和逆向不可以直接相连，逆向和正向可以直接相连
         * 2.括号数量必须要为偶数
         * 3.出现前括号必须有后括号在其后
         * 初步想法，将字符串转化为char数组，使用栈即可
         */


        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isMatch("{[}]"));
    }

    private static boolean isMatch(String s) {
        //创建栈
        Stack<Character> sk = new Stack<Character>();
        //拆分字符入栈
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                sk.push('(');
            }
            if (s.charAt(i) == ')') {
                if (!sk.isEmpty() && sk.pop() == '(')
                    continue;
                else
                    return false;
            }
            if (s.charAt(i) == '[') {
                sk.push('[');
            }
            if (s.charAt(i) == ']') {
                if (!sk.isEmpty() && sk.pop() == '[')
                    continue;
                else
                    return false;
            }

        }

        if (sk.isEmpty())
            return true;
        else
            return false;
    }
}
