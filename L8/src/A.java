// L8 Assignment
// Author: Ethan Rutledge
// Date: Feb 20, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class A {

	protected double x,y;
	
	public A(double x, double y) {
		System.out.println("Constructor: A");
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public java.lang.String toString() {
		return "(" + Double.toString(this.x) + ", " + Double.toString(this.y) + ")";
	}
	
	public java.lang.String toString(java.lang.String message){
		return message.concat(this.toString());
	}
	
	public double sum() {
		return this.x + this.y;
	}
	
	public double product() {
		return this.x * this.y;
	}
	
}

