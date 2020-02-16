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
public class Circle {
    private double radius;
    
    public double calculateCircleArea(){
        return 2 * Math.PI * radius * radius;
    }

	public Circle() {
		
	}
	public Circle(double radius){
		this.radius = radius;
	}
}
