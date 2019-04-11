// The client for the application provides the name of the shape required as follow.
//https://javarevisited.blogspot.com/2012/06/20-design-pattern-and-software-design.html

/**
 * Client
 */

 package factorypattern;
public class Application {
    public static void main(String[] args) {
        //requests for circle shape
        GeometricShape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        if (circle != null) {
            circle.draw();
        } else {
            System.out.println("This shape can not be drawn.");
        }
        //requests non existent shape
        GeometricShape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        if (triangle != null) {
            triangle.draw();
        } else {
            System.out.println("This shape can't be drawn");
        }
    }
}