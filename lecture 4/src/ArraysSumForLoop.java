
public class ArraysSumForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] marks = {76, 23, 42};
		// Sum all values in arrays
		// Print in console
		//		int result = 10;
		//		System.out.println("result value: "+result);
		//		int testInt = 90;
		//		result = 200;
		//		System.out.println("result value: "+result);
		
		int sum = 0;
		
		for(int i = 0; i < marks.length; i++){
			sum += marks[i];
		}
		System.out.println("Sum of marks: "+sum);
		
		System.out.println(marks[0]+marks[1]+marks[2]);
		int sumTest = 0;
		sumTest = sumTest + 200; //200
		sumTest = sumTest + 220; //200 + 220 = 420
		sumTest = sumTest + 240; //420 + 240 = 660
		// sumTest += 200
		// sumTest += 220
		// sumTest += 240
		
		
		// -= and look how this operator works
		int subOperator = 660;
		subOperator -= 200;
		subOperator -= 220;
		subOperator = subOperator - 240;
		
		
		System.out.println("Testing += operator: "+sumTest);
		System.out.println("Testing -= operator: "+subOperator);
		

	}

}
