// P.2 Assignment
// Author: Ethan Rutledge
// Date: Feb 17, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Rectangle extends PolygonPrimitive{

	public Rectangle(int x, int y, int width, int height) {
		this.xPoints = new int[] {x, x + width};
		this.yPoints = new int[] {y, y + height};
	}
}

