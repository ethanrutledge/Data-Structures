// L8 Assignment
// Author: Ethan Rutledge
// Date: Feb 20, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class Main {
	public static void main(String[] args) {
		// Instantiate and test A
		A a = new A(2.0, 4.0);
		System.out.printf("x: %.1f, y: %.1f\n", a.getX(), a.getY());
		System.out.printf("a: %s\n", a);
		System.out.println(a.toString("A class: "));
		System.out.printf("a.sum: %.1f\n", a.sum());
		System.out.printf("a.product: %.1f\n", a.product());
		// System.out.println("a.power: " + a.power());
		System.out.println("\n");
		
		// Instantiate and test B
		B b = new B(3.0, 5.0);
		System.out.printf("b: %s\n", b);
		System.out.println(b.toString("B class: "));
		System.out.printf("b.sum: %.1f\n", b.sum());
		System.out.printf("b.product: %.1f\n", b.product());
		System.out.printf("b.power: %.1f\n", b.power());
		System.out.println("\n");

		/* Why does the super class constructor have to come before any other code?
		 * 
		 * So that it knows where to look to
		*/

		/* x and y were declared in class A. Why can you use x and y for the power method in class B?
		 * 
		 * Because class B extends class A
		*/

		/* What changes in the code would cause B to not have the member variables x and y?
		 * 
		 *	If "extends A" was deleted
		*/

		/* What happens when you uncomment the call to a.power?
		 * 
		 *	It causes a compiler error
		 *
		 * Why can't you call the power method using an instance of class A?
		 * 
		 *	Because power() isn't not defined in A
		*/
		
		// Instantiate and test C
		C c = new C(2.0, 3.0, 4.0);
		System.out.println("c: " + c);
		System.out.println(c.toString("C class: "));
		System.out.println(c.toString());
		System.out.println("c.sum: " + c.sum());
		System.out.println("c.product: " + c.product());
		System.out.println("c.power: " + c.power());
		System.out.println("\n");
		
		/* When the code calls the overloaded toString(String) on the C instance,
		 * in which classes does it run code? HINT: use the debugger with "step into"
		 * to observe what classes are called. Be specific.
		 *
		 * Bottom to top.
		 *
		 * When the code calls the  original toString() on the C instance,
		 * in which classes does it run code?
		 * 
		 * It runs it in C only. But, it would call B, then A to get x, and y.
		 *
		 * How does Java determine which version of a method to use in an inheritance hierarchy?
		 *
		 *	Bottom to top checks for overrides.
		 */
	}
}

