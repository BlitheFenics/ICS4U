package Makins;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentInfo extends Student {
	
	static Student student = new Student();
	static Scanner in = new Scanner(System.in);
	static ArrayList<Student> studRecs = new ArrayList<Student>();
	
	public static void main(String[] args) {
		
		int menu = 0;
		
		do{
			System.out.println("1. Enter your student information.");
			System.out.println("2. Print One student Record.");
			System.out.println("3. Print all student records.");
			System.out.println("4. Remove a student.");
			System.out.println("5. Search for a student.");
			System.out.println("6. Sort Student Records.");
			System.out.println("10. Exit the program.");
			menu = Integer.parseInt(in.nextLine());
			
			if (menu == 1) 
				studentRecord();
			
			else if (menu == 2){
				
				System.out.println("Which student do you want to print?");
				int studentNumber = in.nextInt();
				PrintStudent(studRecs.get(studentNumber));
			
			}
			
			else if (menu == 3)
				printAll(student);

			else if (menu == 4)
				removeStudent();
					
			else if (menu == 5){
				
				System.out.println("Which student do you want to search for?");
				int studentNumber = in.nextInt();
				searchStudent(studRecs.get(studentNumber));
			
			}	
				
			else if (menu == 6)
				sortStudent();
			
		}while(menu != 10);
				 System.exit(0);
	
	}
		
		public static void studentRecord(){
			 
		Student student = new Student();
		System.out.println("Enter Your First Name.");
		student.setFirstName(in.nextLine());
		System.out.println("Enter Your Last Name.");
		student.setLastName(in.nextLine());
		System.out.println("Enter Your Street Address.");
		student.setStreetAddress(in.nextLine());
		System.out.println("Enter Your City.");
		student.setCity(in.nextLine());
		System.out.println("Enter Your Province.");
		student.setProvince(in.nextLine());
		System.out.println("Enter Your Postal Code.");
		student.setPostalCode(in.nextLine());
		System.out.println("Enter Your Phone Number.");
		student.setPhoneNumber(in.nextLine());
		System.out.println("Enter Your Birthdate.");
		student.setBirthDate(in.nextLine());
		studRecs.add(student);
		
		}
			
		public static void PrintStudent(Student student){
			
			
            System.out.println(student.getFirstName());
			System.out.println(student.getLastName());
			System.out.println(student.getStreetAddress());
			System.out.println(student.getCity());
			System.out.println(student.getProvince());
			System.out.println(student.getPostalCode());
			System.out.println(student.getPhoneNumber());
			System.out.println(student.getBirthDate());
		
		}
		
		public static void printAll(Student student2){
			
			for(int i=0; i<studRecs.size(); i++)
				// goes through the entire list of students created
				{
				int j=i+1;
				System.out.println("student: "+j);
				PrintStudent(studRecs.get(i));
				// calls the printInfo method to print the information of the i student
				System.out.println("");
				}
		}
		
		public static void removeStudent(){
			System.out.println("Type the student number of the student you want to delete (first one starts at 000000000).");
			Student tempRecord = studRecs.get(in.nextInt());
			tempRecord.remove();
		}

		public static void searchStudent(Student student){
			
			System.out.println(student.getFirstName());
			System.out.println(student.getLastName());
			System.out.println(student.getStreetAddress());
			System.out.println(student.getCity());
			System.out.println(student.getProvince());
			System.out.println(student.getPostalCode());
			System.out.println(student.getPhoneNumber());
			System.out.println(student.getBirthDate());
		}
		
		public static void sortStudent(){
			Collections.sort(studRecs);
		}
		
}



		
		

		
		
		
		 
		


			


