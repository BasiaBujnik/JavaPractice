package com.company;

/*
Given 3 int values, a b c, return their sum. However, if one of the values
is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */

public class LoneSum {

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

        System.out.println(compareNumbers(firstNumber, secondNumber, thirdNumber));
    }

    private static int compareNumbers(int a, int b, int c) {
        if(a == b && a == c)
            return 0;

        if(a == b)
            return c;

        if(b == c)
            return a;

        return a == c ? b : (a + b + c);
    }

}
