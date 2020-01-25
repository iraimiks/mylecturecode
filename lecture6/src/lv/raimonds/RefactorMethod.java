package lv.raimonds;

public class RefactorMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(getGreeating(20));
		getGreeatingWithVoid(3);
		double number = 20.45;
		int num = (int)number;
		System.out.println(num);
		
	}
	public static String getGreeating(int time){
		if(time <= 8){
			return "Good morning.";
		}else if(time <= 18){
			return "Good day.";
		}else{
			return "Good evening.";
		}
	}
	public static void getGreeatingWithVoid(int time){
		if(time <= 8){
			System.out.println("Good morning.");
		}else if(time <= 18){
			System.out.println("Good day.");
		}else{
			System.out.println("Good evening.");
		}
	}
}
