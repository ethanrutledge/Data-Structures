// P.2 Assignment
// Author: Ethan Rutledge
// Date: Feb 17, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Square  extends PolygonPrimitive{
	
	public Square(int x, int y, int size) {
		this.xPoints = new int[] {x, x + size};
		this.yPoints = new int[] {y, y + size};
	}
}

