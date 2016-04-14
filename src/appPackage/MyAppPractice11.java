package appPackage;

import java.util.ArrayList;
import java.util.Scanner;

import employeePackage.Employee;
import employeePackage.Person;

public class MyAppPractice11 {

	public static void main(String[] args) {
		
		ArrayList<Person> myList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
        String[] titles={"SW1","SW2","SW3","Bob"};
        String[] cat={"Scifi","Scifi","Scifi","Drama"};
        
        for (int i = 0; i < 4; i++) {
            myList.add(new Person());
            
            myList.get(i).setFirstName(titles[i]);
            myList.get(i).setLastName(cat[i]);
	


//		// Create for loop to fill an array with names of Person class.
//		for (int i = 0; i < 3; i++) {
//			myList.add(new Person());
//			
//			myList.get(i).setFirstName(sc.nextLine());
//			myList.get(i).setLastName(sc.nextLine());
//		}
//		
//		// Same type loop but this will create names of Employee class
//		for (int i = 3; i < 5; i++) {
//			myList.add(new Employee());
//			
//			myList.get(i).setFirstName(sc.nextLine());
//			myList.get(i).setLastName(sc.nextLine());
//		}
		
		
/*		myList.add(new Person());
		
		myList.add(new Person());
		
		myList.add(new Person());*/
		
/*		myList.get(0).setFirstName("John");	
		myList.get(0).setLastName("Paul");
		
		myList.get(1).setFirstName("Mary");	
		myList.get(1).setLastName("Jobs");
		
		myList.get(2).setFirstName("Jason");	
		myList.get(2).setLastName("Scott");*/
		
		// For that will print the names stored in the array myList
//		for (int i = 0; i < myList.size(); i++) {
//			myList.get(i).printName();
//		}
//		
		// Enhanced version of previous loop
		for (Person p:myList) { 
			p.printName();
		}
		
		
/*		// create a new person
		Person p = new Person();
		// set the first and last name for that person
		p.setFirstName("John");
		p.setLastName("Paul");
		
		// create a new employee
		Employee e1 = new Employee();
		// set the first and last name for that employee
		e1.setFirstName("Mary");
		e1.setLastName("Jobs");
		
		
		p.printName();
		e1.printName();*/
		
	}

}
}
