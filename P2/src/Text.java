// P.2 Assignment
// Author: Ethan Rutledge
// Date: Feb 17, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Text extends Primitive{

	private int color;
	private int x,y;
	private String text;
	private String fontName;
	private int fontSize;
	
	public void setColor(int color) {
		this.color = color;
	}

	public void setFont(String fontName, int fontSize) {
		this.fontName = fontName;
		this.fontSize = fontSize;
	}
	
	void draw(UserInterface ui) {
		
	}
	
	public Text(int x, int y, String text) {
		this.x = x;
		this.y = y;
		this.text = text;
	}
}

