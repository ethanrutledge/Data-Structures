// P.2 Assignment
// Author: Ethan Rutledge
// Date: Feb 17, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Text extends Primitive{

	private int x,y;
	private String text;
	private String fontName;
	private int fontSize;

	public void setFont(String fontName, int fontSize) {
		this.fontName = fontName;
		this.fontSize = fontSize;
	}
	
	
	public void draw(UserInterface ui) {
		ui.setFont(fontName, fontSize);
		ui.textColor(color);
		ui.drawText(x, y, text);
	}
	
	public Text(int x, int y, String text) {
		this.x = x;
		this.y = y;
		this.text = text;
	}
}

