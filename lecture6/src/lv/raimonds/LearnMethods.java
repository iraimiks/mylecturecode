package lv.raimonds;

public class LearnMethods {

	
	// void not return type
	// public private protected
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getMyName();
//		getMyName();
//		getMyName();
//		getMyName();
//		getMyName();
//		getMyName();
		System.out.println("_________________________");
		getMyCity();
//		String objectString = "58582 ajsfhasf";
		
		LearnMethods classObject = new LearnMethods();
		
		
		classObject.doYouHaveCat();

	}
	public static void getMyName(){
		System.out.println("My name is Raimonds");
	}
	public static void getMyCity(){
		getMyName();
		System.out.println("My city is Ludzas");
	}
	public void doYouHaveCat(){
		System.out.println("NO");
	}
	
}
