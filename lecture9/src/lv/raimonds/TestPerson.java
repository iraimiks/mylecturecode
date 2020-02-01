package lv.raimonds;

import lv.raimonds.users.Teacher;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] strArr = new String[12];
		strArr[0] = "Sport";
		strArr[1] = "Math";
		System.out.println(strArr[0]+", "+strArr[1]);
		
		Teacher teacher1 = new Teacher("Toms","Riga");
		System.out.println(teacher1.toString());
//		teacher1.addCourse("Sport");
//		teacher1.addCourse("Math");
//		teacher1.addCourse("Biology");
//		teacher1.addCourse("History");
		String[] courses = {"Sport", "Math", "Biology", "History"};
		
		//For-each loops
		for(String course : courses){
			teacher1.addCourse(course);
		}
		
		
		Teacher t1 = new Teacher("Toms B", "Riga iela");
		System.out.println(t1.toString());
		String[] coursesForT1 = {"CS10", "AL", "BIO", "CS10"};
		for(String core : coursesForT1){
			if(t1.addCourses(core)){
				System.out.println(core + " added ");
			}else{
				System.out.println(core + " cannot be addes");
			}
		}
		for(String core : coursesForT1){
			if(t1.removeCourses(core)){
				System.out.println(core + " removed ");
			}else{
				System.out.println(core + " cannot be removed");
			}
		}
	}
}
