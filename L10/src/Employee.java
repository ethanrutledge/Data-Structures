import java.util.Random;

/**
 * The Employee class contains functionality common to types of employees in the company.
 * For example, all employees have a first name and a last name and an average number of lines of
 * code that can be coded or tested.
 *
 * On a side note, a few reminders pulled straight from the Oracle documentation <br>
 *
 * An abstract class is a class that is incomplete, or to be considered incomplete.<br>
 * Normal classes may have abstract methods (methods that are declared but not yet implemented) only
 * if they are abstract classes.
 *<p>
 * Originated for CS161 in 2015 <br>
 * modified by garethhalladay on 9/21/17
 */
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final int averageLinesOfCode;
    private Random r;
    
    public Employee(java.lang.String firstName, java.lang.String lastName, int averageLinesOfCode) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.averageLinesOfCode = averageLinesOfCode;
    	setRandom();
    }
    
    public java.lang.String getFirstName(){
    	return this.firstName;
    }
    
    public java.lang.String getLastName(){
    	return this.lastName;
    }
    
    public int getAverageLinesOfCode() {
    	return this.averageLinesOfCode;
    }
    
    public java.lang.String toString(){
    	String s = "";
    	
    	if (this instanceof Programmer) {
    		s += "Programmer ";
    	}
    	else if (this instanceof Tester){
    		s += "Tester ";
    	}
    	
    	s += this.firstName + " " + this.lastName + ", ";
    	s += "average productivity: " + this.averageLinesOfCode + " lines";
    	
    	return s;
    }


    /**
     * The amount of work an employee does each day. Implemented in the concrete classes.
     */
    public abstract int work();


    private void setRandom(){
        this.r = new Random(String.format("%s%s%d", firstName, lastName, averageLinesOfCode).hashCode());
    }

    /**
     * A helper method to return a random whole number inclusively between two bounds.
     * Created to to be used in the Programmer and Tester work methods.
     * @param lower lower limit
     * @param upper upper limit
     * @return a random integer between the lower and upper limit.
     */
    public int randomBetween(double lower, double upper){
        long l = Math.round(Math.ceil(lower));
        long u = Math.round(Math.floor(upper));
        long r = (long) (this.r.nextDouble() * (u - l + 1));
        return (int) (l + r);
    }
}
