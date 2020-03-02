// P3 Assignment
// Author: Ethan Rutledge
// Date: Feb 26, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class PolygonPrimitive extends Primitive{
	public int[] xPoints, yPoints;
	
	@Override
	public void draw(UserInterface ui) {
		ui.lineColor(color);
		ui.fillColor(color);
		ui.drawPolygon(xPoints, yPoints, isFilled);
	}
}

