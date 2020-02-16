/*
 * Shankar Ghimire
 * StudentId:991585190
 * Course: ...............
 */
package shapes;

/**
 *
 * @author Dell
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea(){
        return this.length * this.width;
    }
}
