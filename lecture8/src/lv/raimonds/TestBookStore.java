package lv.raimonds;



import lv.raimonds.bookstore.Author;
import lv.raimonds.bookstore.Book;

public class TestBookStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Author rowling = new Author("J.K.Rowling", "rowling@gmail.com", 'f');
		Author rainis = new Author("Rainis", "rainis@gmail.com", 'm');
		System.out.println(rowling.getEmail());
		rowling.setEmail("rowli@gmail.com");
		System.out.println(rowling.getEmail());
		
		Author test20 = new Author("Test20");
		
		Book harraypoter = new Book("Harray Poter", rowling, 20.3, 1000);
		Book testBook = new Book("Books", new Author("Author1", "email@email", 'm'),24.4, 200);
		System.out.println(testBook.toString());
		System.out.println(harraypoter.toString());
		
		Book testBook2 = new Book("Test Book", test20, 40.2, 20);
		
		System.out.println(testBook2.toString());
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		
		Author test1 = new Author("name","name@name",'f');
		Author test2 = new Author("name1","name1@name1",'0');
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		char checkChar = 'm';
		boolean testBool = checkGender(checkChar);
		System.out.println(testBool);
	
		char m = 'm';
		char f = 'f';
		char o = 'j';
		
		if(m == o  || f == o){
			System.out.println("It is M or F");	
		}else{
			System.out.println("It is not M or F");	
		}
		
		switch(o){
			case 'm':
				System.out.println("Its m");
				break;
			case 'f':
				System.out.println("Its f");
				break;
			default:
				System.out.println("Not in list");	
		}
	}
	public static boolean checkGender(char gender){
		char m = 'm';
		char f = 'f';
		if(m == gender  || f == gender){
			return true;
		}else{
			return false;
		}
	}

}
