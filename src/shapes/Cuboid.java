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
public class Cuboid {
    private double length, width, height;
    public double calculateCuboidVolume(){
        return length * width * height;
    }

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

	public Cuboid() {
		// TODO - implement Cuboid.Cuboid
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param parameter
	 */
	public Cuboid(int parameter) {
		// TODO - implement Cuboid.Cuboid
		throw new UnsupportedOperationException();
	}
}
