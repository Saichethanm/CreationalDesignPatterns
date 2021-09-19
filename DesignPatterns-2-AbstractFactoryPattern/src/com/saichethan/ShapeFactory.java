package com.saichethan;

public class ShapeFactory extends  AbstractFactory{
    @Override
    public Shape getShape(String shapeName)
    {
        if(shapeName.equalsIgnoreCase("Triangle"))
        {
            return new Triangle();
        }

        else if(shapeName.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }

        else if(shapeName.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        return null;
    }
}
