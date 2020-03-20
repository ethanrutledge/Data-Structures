import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PQ2{

    public static List<Shape> createShapeArray(){
        // Use the following points to create your shapes
        Point a = new Point(1, 0);
        Point b = new Point(1, 5);
        Point c = new Point(3, 5);
        Point d = new Point(3, 0);
        // your code here
        
        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(new Circle(a,b));
        list.add(new Triangle(a,b,c));
        list.add(new Rectangle(a,b,c,d));

        return list;
    }

    public static void displayArea(List<Shape> shapes){
        // Your code here
    	for(int i = 0; i < shapes.size(); i++) {
    		if (shapes.get(i) instanceof Circle) {
    			System.out.print("CIRCLE: ");
    		}
    		else if (shapes.get(i) instanceof Triangle) {
    			System.out.print("TRIANGLE: ");
    		}
    		else if (shapes.get(i) instanceof Rectangle) {
    			System.out.print("RECTANGLE: ");
    		}
    		System.out.printf("%.2f\n",shapes.get(i).calculateArea());
    	}

    }

    public static int sumOfSquares(List<Integer> num){
        // Your code here
        
    	return sumHelp(num, num.size() - 1, 0);
    }
    
    public static int sumHelp(List<Integer> num, int i, int sum) {
    	if (i <= 0) {
    		return sum + (int) Math.pow(num.get(0), 2);
    	}
    	int n = (int)Math.pow(num.get(i), 2);
    	sum += n;
    			
    	num.add(i,nho);
    	
    	return sumHelp(num, i - 1, sum);
    }




    public static void main(String [] args){
        // Question 1
        // Testing the createShapeArray method
        List<Shape> shapes = createShapeArray();
        System.out.println("Created correct array: " + shapes.toString().equals("[[Circle, Point a = (1.00, 0.00), Point b = (1.00, 5.00)], [Triangle, Point a = (1.00, 0.00), Point b = (1.00, 5.00), Point c = (3.00, 5.00)], [Rectangle, Point a = (1.00, 0.00), Point b = (1.00, 5.00), Point c = (3.00, 5.00), Point d = (3.00, 0.00)]]"));

        /* Question 2
         * displayArea should print:
         *
         * CIRCLE: 78.54
         * TRIANGLE: 5.00
         * RECTANGLE: 10.00
         */
        displayArea(shapes);

        // Question 3
        // testing an odd amount of numbers
        List<Integer> exampleOdd = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(exampleOdd); // [1, 2, 3]
        System.out.println(sumOfSquares(exampleOdd)); // 14
        System.out.println(exampleOdd); // [1, 1, 2, 4, 3, 9]

        // testing an even amount of numbers
        List<Integer> exampleEven = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(exampleEven); // [1, 2, 3, 4]
        System.out.println(sumOfSquares(exampleEven)); // 30
        System.out.println(exampleEven); // [1, 1, 2, 4, 3, 9, 4, 16]

    }

 }