package com.saichethan;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<Integer, Shape> shapeMap  = new Hashtable<Integer, Shape>();

    public static Shape getShape(int shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public void loadData() {

        Square square = new Square();
        square.setId(1);
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(2);
        shapeMap.put(rectangle.getId(), rectangle);

    }
}
