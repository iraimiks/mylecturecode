package lv.raimonds;

public class TestArrayAndLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = new String[6];
		String[] arrWith = { "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1" };
		arrToString(arr);
		System.out.println();
		arrToString(arrWith);
		System.out.println();
		addElementToArr(arrWith);
		
	}
	public static void arrToString(String[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println("index number are "+i+" "+arr[i]);
		}
	}
	
	public static void addElementToArr(String[] arr){
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = arr[i] + i;
		}
		arrToString(arr);
	}

}
