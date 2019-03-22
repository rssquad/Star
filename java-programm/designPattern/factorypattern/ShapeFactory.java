// Now, let's create a factory that provides the product (in this case, GeometricShape):
/**
 * Concrete Product
 */
package factorypattern;

public abstract class ShapeFactory {
    public static GeometricShape getShape(ShapeType name) {
        GeometricShape shape = null;
        switch (name) {
        case LINE:
            shape = new Line();
            break;
        case CIRCLE:
            shape = new Circle();
            break;
        case RECTANGLE:
            shape = new Rectangle();
            break;
        case TRIANGLE:
            // shape = new Triangle();
            break;
        }
        return shape;
    }
}