package my.company.method_links;

import my.company.functional.MyClassBoolean;

public class App1 {

    public static void main(String[] args) {

        int[] nums = { -1, 2, 3, 4, -5, 6, 7, 8, 9 };

        MyClassBoolean isEven = ExpressionHelper::isEven;
        System.out.println(sum(nums, isEven));
        System.out.println(sum(nums, ExpressionHelper::isPositive));

        ExpressionHelper expressionHelper = new ExpressionHelper();
        System.out.println(sum(nums, expressionHelper::isNegative));

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
