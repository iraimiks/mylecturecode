
public class TaskExemple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] number = {2,3,1,4};
		int findNumber = 2;
		int numberFind = 0;
		for(int i = 0; i < number.length; i++){
			if(number[i]==findNumber){
				numberFind = number[i];
			}
		}
		if(numberFind==1){
			System.out.println("ONE");
		}else if(numberFind==2){
			System.out.println("TWO");
		}else if(numberFind==3){
			System.out.println("THREE");
		}else if(numberFind==4){
			System.out.println("FOUR");
		}else{
			System.out.println("No such number");
		}
	}
}
