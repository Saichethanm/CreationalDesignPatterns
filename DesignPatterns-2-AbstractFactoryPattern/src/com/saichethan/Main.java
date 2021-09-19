package com.saichethan;

public class Main {

    public static void main(String[] args) {
	// write your code here

        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.Draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.Draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.Draw();

        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.Draw();

        Shape shape5 = shapeFactory.getShape("TRIANGLE");
        shape5.Draw();
    }
}
