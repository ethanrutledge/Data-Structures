// P.2 Assignment
// Author: Ethan Rutledge
// Date: Feb 17, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Square  extends Primitive{

	private int color;
	private int x, y;
	private int size;
	private boolean isFilled;
	
	public void setColor(int color) {
		this.color = color;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	void draw(UserInterface ui) {
		ui.lineColor(color);
		ui.fillColor(color);
		ui.drawRectangle(x, y, size, size, isFilled);
	}
	
	public Square(int x, int y, int size) {
		this.x = x;
		this.y =y;
		this.size = size;
	}
}

