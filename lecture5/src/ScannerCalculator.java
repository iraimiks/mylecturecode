import java.util.Scanner;


public class ScannerCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Number 2: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Input operator /+-*% :");
		String operatorSymbol = sc.nextLine();
		
		int result = 0;
		
		if(operatorSymbol.equals("+")){
			result = num1 + num2;
		}else if(operatorSymbol.equals("-")){
			result = num1 - num2;
		}else if(operatorSymbol.equals("*")){
			result = num1 * num2;
		}else if(operatorSymbol.equals("/")){
			result = num1 / num2;
		}
		
		System.out.println("Test result: "+result);
		//System.out.println(result +" = "+ num1 +" "+operatorSymbol+" " + num2);
	}

}
