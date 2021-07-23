package com.saichethan;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // compilation error because constructor is private.
//        SingletonPattern singletonPatternObj = new SingletonPattern();


        SingletonPattern singletonPatternObj = SingletonPattern.getInstance();

        singletonPatternObj.singletonPatternTestFunction();
    }
}
