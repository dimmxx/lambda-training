package my.company.constructor_links;

import my.company.functional.UserBuilder;

public class App2 {

    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Dima");
        System.out.println(user);
    }

}
