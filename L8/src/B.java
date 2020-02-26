// L8 Assignment
// Author: Ethan Rutledge
// Date: Feb 20, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class B extends A{
	public B(double x, double y) {
		super(x,y);
		System.out.println("Constructor: B");
	}
	
	public double power() {
		return Math.pow(this.x, this.y);
	}
}

