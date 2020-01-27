package my.company;

import my.company.functional.MyClassGeneric2;

public class AppGeneric2 {

    public static void main(String[] args) {

        MyClassGeneric2<Integer, String> myClassGeneric = (str) -> Integer.parseInt(str);
        System.out.println(myClassGeneric.transform("5").getClass());

    }
}
