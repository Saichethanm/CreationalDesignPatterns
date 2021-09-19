package com.saichethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadData();

        Shape clonedShape = (Shape) ShapeCache.getShape(1);
        System.out.println("Shape : " + clonedShape.getType());
        clonedShape.draw();

        Shape clonedShape2 = (Shape) ShapeCache.getShape(2);
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();
    }
}
