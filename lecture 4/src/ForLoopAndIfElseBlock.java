
public class ForLoopAndIfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] number = {1, 3, 4, 2};
		//Find in array number ?? 
		//and print his name in Console
		int checkNumber = 2;
		
		for(int i = 0; i < number.length; i++){
//			if(number[i] != checkNumber){
//				System.out.println("Note number in array");
//			}else{
//				System.out.println(number[i]);
//			}
			switch(number[i]){
				case 1:
					System.out.println("ONE");
					break;
				case 2:
					System.out.println("TWO");
					break;
				default:
					System.out.println("Not number");
					
					
			}
		}
	}
}

