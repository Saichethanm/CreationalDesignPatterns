package com.saichethan;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeName)
    {
        if(shapeName.equalsIgnoreCase("Rectangle"))
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
