package my.company;

import my.company.functional.Operation;

public class App3 {

    public static void main(String[] args) {

        Operation action = operation(2);
        System.out.println(action.execute(5, 1));

        System.out.println(operation(1).execute(4, 3));
    }

    private static Operation operation(int number){
        switch(number){
            case 1: return (x, y) -> x + y;
            case 2: return (x, y) -> x - y;
            case 3: return (x, y) -> x * y;
            default: return (x,y) -> 0;
        }
    }


}
