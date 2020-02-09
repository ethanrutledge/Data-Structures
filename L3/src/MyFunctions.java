import java.util.Arrays;

// L3 Assignment
// Author: Ethan Rutledge
// Date: Feb 4, 2020
// Class: CS165
// ethanrut@rams.colostate.edu

public class MyFunctions implements TestingFunctions {

	@Override
	public int greatestCommonDivisor(int a, int b) {
		
		if (a < 0 || b < 0) {
			return -1;
		}
		else if (a == 0) {
			return b;
		}
		else if (b == 0) {
			return a;
		}
		else if (a % b == 0) {
			return b;
		}
		else {
			return greatestCommonDivisor(b, a % b);
		}
	}

	@Override
	public void reverseWindow(int[] arr, int index1, int index2) throws IndexOutOfBoundsException {
		
		if (index1 > index2) {
			int temp = index1;
			index1 = index2;
			index2 = temp;
		}
		
		while(index1 < index2) {
			int temp = arr[index1];
			arr[index1] = arr[index2 - 1];
			arr[index2 - 1] = temp;
			index1++; index2--;
		}		
	}	
}

