package my.company;

import my.company.functional.MyClassVoid;

public class AppVoid {

    public static void main(String[] args) {

        MyClassVoid getLine = (str) -> System.out.println(str);

        getLine.transform("FFF");


    }

}
