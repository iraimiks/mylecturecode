
public class ArraysAndLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Declare variable
		int[] marks = {76, 23, 42, 10, 56};
		//Make toString all elements of array
		//Print in console
		//System.out.println("[ "+marks[0]+", "+marks[1]+" ]");
		// System.out.println print new line
		// System.out.print print in one line
//		for(int i = 0; i < marks.length; i++){
//			System.out.println(marks[i]);
//		}
		System.out.print("[");
		for(int i = 0; i < marks.length-1; i++){
			System.out.print(marks[i]+", ");
		}
		System.out.print(marks[marks.length-1]+"]");
		//System.out.print(marks[4]+"]");
		
		System.out.println("\n"+marks.length);
		
		System.out.println(marks.length-1);
		
		System.out.println(marks[4]);
	}
}