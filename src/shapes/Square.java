package shapes;

public class Square {

	private double length;

	public Square() {
		
	}
	public Square(double length){
		this.length = length;
	}
        public double getSquareArea(){
            return length * length;
        }

}
