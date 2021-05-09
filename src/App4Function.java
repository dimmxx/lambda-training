import java.time.LocalTime;
import java.util.Scanner;
import java.util.function.*;

public class App4Function {

    public static void main(String[] args) {

        String test = "HeLlO wOrlD!";
        Function<String, String> functionUpper1 = x -> x.toUpperCase();
        System.out.println(functionUpper1.apply(test));
        Function<String, String> functionUpper2 = String::toUpperCase;
        System.out.println(functionUpper2.apply(test));

        //===========================================================================

        Predicate<String> letterCount1 = x -> x.length() == 12;
        System.out.println(letterCount1.test(test));

        Predicate<String> startsWith = x -> x.startsWith("H");
        Predicate<String> endsWith = x -> x.endsWith("!");
        boolean check = startsWith.and(endsWith).test(test);
        System.out.println(check);

        //===========================================================================

        Supplier<String> timeSupplier = () -> LocalTime.now().toString();
        System.out.println(timeSupplier.get());

        Supplier<String> str = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            return name;
        };
        System.out.println(str.get());

        //===========================================================================

        Consumer<String> linePrint = x -> System.out.println(x);
        linePrint.accept("linePrint");

        Consumer<String> linePrint1 = System.out::println;
        linePrint1.accept("linePrint");

        //===========================================================================

        BinaryOperator<Integer> sum = (x, y) -> x + y;
        System.out.println(sum.apply(5, 6));

        BinaryOperator<Integer> sum1 = Integer::sum;
        System.out.println(sum1.apply(5, 6));

        //===========================================================================

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5));

    }
}
