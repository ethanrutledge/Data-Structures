import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Content originated from Kushagra Tiwary, 10/30/2016
 * Modified by garethhalladay, 19/13/2017
 */
public class TestProgram {

	

    /**
     * Test cases for the Triangle class
     * @param a initial value for the Triangle constructor
     * @param b initial value for the Triangle constructor
     * @param c initial value for the Triangle constructor
     */
    static void testTriangle(Point a, Point b, Point c){
        Triangle tri1 = new Triangle(a,b,c);
        System.out.printf("Perimeter of triangle=%.2f",tri1.calculatePerimeter());
        System.out.printf("->%b\n", String.format("%.2f", tri1.calculatePerimeter()).equals("13.66"));
        System.out.printf("Area of triangle=%.2f", tri1.calculateArea());
        System.out.printf("->%b\n", String.format("%.2f", tri1.calculateArea()).equals("8.00"));
        System.out.print(tri1); //prints the return value from tri1.toString()
    }

    /**
     * Test cases for the Rectangle class
     * @param a initial value for the Rectangle constructor
     * @param b initial value for the Rectangle constructor
     * @param c initial value for the Rectangle constructor
     * @param d initial value for the Rectangle constructor
     */
    static void testRectangle(Point a, Point b, Point c, Point d){
        Rectangle rect1 = new Rectangle(a,b,c,d);
        System.out.print("Perimeter of rectangle="+rect1.calculatePerimeter());
        System.out.printf("->%b\n", String.format("%.2f", rect1.calculatePerimeter()).equals("16.00"));
        System.out.print("Area of rectangle="+rect1.calculateArea());
        System.out.printf("->%b\n", String.format("%.2f", rect1.calculateArea()).equals("16.00"));
        System.out.println(rect1); //prints the return value from rect1.toString()
    }

    /**
     * Test cases for the Circle class
     */
    static void testCircle(){
        List<Circle> cArr = new ArrayList<>(Arrays.asList(new Circle(new Point(0, 0), new Point(0, 1)),
                                                            new Circle(new Point(0,0),new Point(0,4)),
                                                            new Circle(new Point(0,0),new Point(0,2))));

        System.out.println(cArr);
        System.out.printf("Circle class->%b\n", cArr.toString().equals(
                                        "[[radius = 1.00, area = 3.14, perimeter = 6.28], " +
                                        "[radius = 4.00, area = 50.27, perimeter = 25.13], " +
                                        "[radius = 2.00, area = 12.57, perimeter = 12.57]]"));
    }

    static void testSorting(){
        List<Shape> shapeArray = createShapeArray();
        // Print out polygons before sorting
        printShapes(shapeArray, "UNSORTED: ");
        // Calling sort method on List, assumes Comparable interface
        shapeArray.sort(Shape::compareTo);
        // Print out polygons after sorting
        printShapes(shapeArray, "SORTED: ");
    }

    /**
     * Creates a list with various shapes.
     * @return a list of polygons
     */
    static List<Shape> createShapeArray(){
        return Arrays.asList(new Rectangle(new Point(0,0),new Point(0,4),new Point(2,4), new Point(2,0)),
                             new Rectangle(new Point(0,0),new Point(0,2),new Point(2,2), new Point(2,0)),
                             new Rectangle(new Point(0,0),new Point(0,3),new Point(2,3), new Point(2,0)),
                             new Circle(new Point(0,0),new Point(0,1)),
                             new Circle(new Point(1,0),new Point(1,4)),
                             new Circle(new Point(1,0),new Point(0,2)),
                             new Triangle(new Point(0,0),new Point(0,2),new Point(2,0)),
                             new Triangle(new Point(0,0),new Point(0,4),new Point(4,0)),
                             new Triangle(new Point(0,0),new Point(0,1),new Point(1,0)));

    }

    /**
     * prints the shapes, one per line.
     * @param array list of various shapes
     * @param label a label that's printed before the shapes are printed. In this case SORTED or UNSORTED
     */
    static void printShapes(List<Shape> array, String label) {

        System.out.println(label + "\n");
        // Iterate array of polygons using a foreach loop
        for (Shape shape : array) {
            // Use getClass to print the class of the Object and then print the Object (calls the toString)
            System.out.printf("%s: %s\n", shape.getClass(), shape);
        }
        System.out.println();
    }

    public static void main(String[]args){

        Point a = new Point(0,0);
        Point b = new Point(0,4);
        Point c = new Point(4,4);
        Point d = new Point(4,0);

        testTriangle(a, b, c);
        testRectangle(a, b, c, d);
        testCircle();
        testSorting();

        /*
         * 1. Can an abstract class have both concrete and abstract methods?
         *
         *	Yes.
         *
         * 2. Can abstract classes inherit from interfaces?
         *
         *	Yes.
         *
         * 3. Why can't you instantiate abstract classes?
         *
         *	Because it is incomplete, i.e. methods with no body, return, or params
         *
         * 4. What is the @Override annotation and what does it do?
         *
         *	Denotes overriding of parents class
         *
         * 5. Explain each statement in the equals method for one of the shapes (it's doesn't matter which one).
         *    Be specific. Use the provided link at the top of the recitation to analyze the code.
         *
         *	if they point to same spot in mem ret true;
         *	if they aren't saem object type ret false;
         *	create rectangle object of o;
         *	returns boolean of checking that all points are the same int;
         *
         * 6. Off the top of my head, I can think of two other ways you could test shape equality.
         *    Name another way you could check if the shapes are equal.
         *
         *	check 1 pt. then check area
         *
         * 7. What is the instanceof operator in Java and what does it do (google for additional information)?
         *
         *	it checks that they are of the same object type i.e. is it actually a rectangle?
         *
         * 8. Why is compareTo not implemented in each shape subclass?
         *
         *	because all subclasses have calculateArea methods so it is irrelavent what object type it is
         *
         * 9. Why is the equals method not just implemented in the shape class?
         * 
         * Because all the shapes are different object types
         * 
         *
         */

    }



}
