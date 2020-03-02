// L10 Assignment
// Author: Ethan Rutledge
// Date: Feb 27, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Programmer extends Employee{

	public Programmer(java.lang.String firstName, java.lang.String lastName, int averageLines) {
		super(firstName, lastName, averageLines);
	}
	
	@Override
	public int work() {
		// TODO Auto-generated method stub
		double low = .5 * this.getAverageLinesOfCode();
		double up = 1.5 * this.getAverageLinesOfCode();
		return super.randomBetween(low, up);
	}

	
}

