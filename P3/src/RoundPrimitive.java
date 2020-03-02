// P3 Assignment
// Author: Ethan Rutledge
// Date: Feb 26, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class RoundPrimitive extends Primitive{
	public int x,y;
	public int width,height;
	
	@Override
	public void draw(UserInterface ui) {
		ui.lineColor(color);
		ui.fillColor(color);
		ui.drawOval(x, y, width, height, isFilled);
	}

}

