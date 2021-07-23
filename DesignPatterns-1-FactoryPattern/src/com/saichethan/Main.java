package com.saichethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{

            //factory object, from factory create the shapes which are required.
            ShapeFactory shapeFactory = new ShapeFactory();


            // shape object, for storing the created shape object
            // Here creating triangle shape object using shapeFactory
            Shape shapeName = shapeFactory.getShape("Triangle");

            shapeName.Draw();


            // Here creating square shape object using shapeFactory
            shapeName = shapeFactory.getShape("Square");

            shapeName.Draw();


            // Here creating rectangle shape object using shapeFactory
            shapeName = shapeFactory.getShape("Rectangle");

            shapeName.Draw();


            // Lets call for a shape which is not there in the implementation
            shapeName = shapeFactory.getShape("Circle");

            shapeName.Draw();

        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}





// change a constructor then client class will also have to change
// there is no abstraction, client is aware of all the arguments
// client has a lot of work to do


//abstraction, loosely coupled, easy to extend

