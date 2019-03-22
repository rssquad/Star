/**
 * Concrete Product
 */
package factorypattern;

public class Rectangle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }
}