// P.2 Assignment
// Author: Ethan Rutledge
// Date: Feb 17, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Oval extends Primitive{
	private int color;
	private int x, y;
	private int width, height;
	private boolean isFilled;
	
	public void setColor(int color) {
		this.color = color;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	void draw(UserInterface ui) {
		
	}
	
	public Oval(int x, int y, int width, int height) {
		this.x = x;
		this.y =y;
		this.width = width;
		this.height = height;
	}
	
}

