
public class ForEach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] marks = {76, 23, 42, 53, 35, 56};
		// For-Each loops for(trype var : arrays)
		for(int mark : marks){	
			System.out.println(mark);
		}
		System.out.println("________________________");
		for(int i = 0; i < marks.length; i++){
			System.out.println(marks[i]);
		}
	}

}
