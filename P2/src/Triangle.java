// P.2 Assignment
// Author: Ethan Rutledge
// Date: Feb 17, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Triangle extends Primitive{
	private int color;
	private int x0, y0;
	private int x1,y1;
	private int x2,y2;
	private boolean isFilled;
	
	public void setColor(int color) {
		this.color = color;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	void draw(UserInterface ui) {
		
	}
	
	public Triangle(int x0, int y0, int x1, int y1, int x2, int y2) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
}

