/**
 * Created by garethhalladay on 8/28/17
 */
public abstract class Primitive {
	
	int color;
	boolean isFilled;
	
	public void setColor(int color) {
		this.color = color;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public abstract void draw(UserInterface ui);
	
}
