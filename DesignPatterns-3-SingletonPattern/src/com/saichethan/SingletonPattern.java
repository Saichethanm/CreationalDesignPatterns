package com.saichethan;

// Only one object should be created from this class
public class SingletonPattern {

    // By making this attribute static, every class only one singletonObject
    // and by using this, we can make this class create only one object.
    private static SingletonPattern singletonObject;

//    private static SingletonPattern singletonObject = new SingletonPattern();

    // making constructor private, so that it cannot be accessed outside
    private SingletonPattern(){

    }

    // lazy instantiation
    public static SingletonPattern getInstance()
    {
        if(singletonObject == null)
        {
            singletonObject = new SingletonPattern();
        }
        return singletonObject;
    }


    public void singletonPatternTestFunction()
    {
        System.out.println("This is a function from SingletonPattern class");
    }
}
