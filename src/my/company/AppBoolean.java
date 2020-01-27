package my.company;

import my.company.functional.MyClassBoolean;

public class AppBoolean {

    public static void main(String[] args) {

        int n = -5;
        MyClassBoolean isPositive = number -> number >= 0;
        System.out.println(isPositive.check(n));

        // Lambda as method parameter: ====================================================

        int[] nums = { -1, 2, 3, 4, -5, 6, 7, 8, 9 };

        MyClassBoolean isNegative = number -> number < 0;
        MyClassBoolean isEven = (num) -> num % 2 == 0;
        MyClassBoolean isPositiveF = num -> num > 0;

        System.out.println(sum(nums, isNegative));
        System.out.println(sum(nums, isEven));
        System.out.println(sum(nums, isPositiveF));

    }

    private static int sum(int[] array, MyClassBoolean checkCondition){
        int count = 0;
        for (int n : array){
            if(checkCondition.check(n)){
                count += n;
            }
        }
        return count;
    }
}
