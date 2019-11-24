package com.blackdog;

public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int count = 1, temp = num;
        while ((temp /= 10) != 0) {
            ++count;
        }
        int half = count / 2;
        for (int i = 1; i <= half; ++i) {
            int lhs = num % 10;
            int rhs = num / ((int)Math.pow(10, --count));
            if (lhs != rhs) return false;
            num -= rhs * (int)Math.pow(10, count--);
            num /= 10;
        }
        return true;
    }
}