// L8 Assignment
// Author: Ethan Rutledge
// Date: Feb 20, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class C extends B{
	private double z;
	
	public C(double x, double y, double z) {
		super(x, y);
		System.out.println("Constructor: C");
		this.z = z;
	}
	
	@Override
	public double sum() {
		return this.x + this.y + this.z;
	}
	
	@Override
	public double product() {
		return this.x * this.y * this.z;
	}
	
	@Override
	public double power() {
		return Math.pow(super.power(), this.z);
	}
	
	@Override
	public java.lang.String toString(){
		return "(" + Double.toString(this.x) + ", " + Double.toString(this.y) + ", " + Double.toString(this.z) + ")";
	}
}

