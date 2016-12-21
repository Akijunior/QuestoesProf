package domain;

public class Rectangle {
	
	public double width, height;
	public Point pontoDeOrigem;
	
	public double area(){
		double area = this.width * this.height;
		return area;
	}
	
	public double perimeter(){
		return 2 * this.width + 2 * this.height;
	}
	
	
	
	

}
