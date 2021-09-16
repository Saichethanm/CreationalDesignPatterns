package com.saichethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user1 = new User.UserBuilder("Chad", "Darby").age(30).phone("9999999999")
                .address("Some address")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Jack", "Reacher")
                .age(20)
                .phone("888888888")
                //no address
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Super", "Man")
                //No age
                //No phone
                //no address
                .build();

        System.out.println(user3);
    }
}
