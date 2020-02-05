package lv.raimonds;

import java.util.Scanner;

public class TestScannerInputArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User number in array is: ");
		int arrElementCount = sc.nextInt();
		
		String[] strArr = new String[arrElementCount];
		sc.nextLine();
		System.out.println(strArr.length+" users in array:");
		for(int i = 0; i < strArr.length; ++i){
			strArr[i] = sc.nextLine();
			
		}
		
		System.out.println("Do you whana print array? ");
		System.out.println("Type (Print)");
		System.out.println("Type (notPrint)");
		String statusCheck = sc.nextLine().toLowerCase().trim();
		
		if(statusCheck.equals("print")){
			printArray(strArr);
		}else if(statusCheck.equals("notprint")){
			System.out.println("Exit");
		}else{
			System.out.println("You enter it wrong");
		}
		
	}
	
	public static void printArray(String[] str){
		
		for(int i=0; i<str.length; i++){
			
			System.out.println(str[i]+" this user is added to array");
			
		}
	}

}
