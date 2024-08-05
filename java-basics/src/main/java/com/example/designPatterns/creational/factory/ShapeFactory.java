package com.example.designPatterns.creational.factory;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        return switch (shapeType == null ? "" : shapeType.toUpperCase()) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}