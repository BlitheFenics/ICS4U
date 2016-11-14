package Makins;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentInfo extends Student {
	
	// Creates scanner, Array list, adds the enum to limit what province can except, and sets up the student record.
	
	static Student student = new Student();
	static Scanner in = new Scanner(System.in);
	static ArrayList<Student> studRecs = new ArrayList<Student>();
	static int numStu;
	enum ProvinceTerritories {Alberta, BritishColumbia, Manitoba, NewBrunswick, NewfoundlandandLabrador, NorthwestTerritories, NovaScotia, Nunavut, Ontario, PrinceEdwardIsland, Quebec, Saskatchewan, Yukon}
	
	
	public static void main(String[] args) {
		
		// Creates The menu and links it to several methods which can be accessed by typing a number. 
		
		int menu = 0;
		
		try{
			
			do{

			System.out.println("1. Enter your student information.");
			System.out.println("2. Print One student Record.");
			System.out.println("3. Print all student records.");
			System.out.println("4. Remove a student.");
			System.out.println("5. Search for a student.");
			System.out.println("6. Sort Student Records.");
			System.out.println("7. Save Records.");
			System.out.println("8. Load a saved record.");
			System.out.println("10. Exit the program.");
			menu = Integer.parseInt(in.nextLine());
			
			if (menu == 1) 
				
				studentRecord();
			
			else if (menu == 2){
				
				// Prints a student record based on the student number the user types and loops back to the menu.
				
				System.out.println("Which student do you want to print? (Student numbers start at 000000001)");
				int studNumber = in.nextInt();
				for(int l=0; l<studRecs.size(); l++)
					if(studRecs.get(l).getStudentNumber() == studNumber)
						System.out.println(studRecs.get(l));
						in.nextLine();
			
			}
			
			else if (menu == 3)
				
				printAll(student);

			else if (menu == 4){
				
				//Deletes a student record associated with the student number the user types.
				
				System.out.println("Type the student number associated with the record you would like to delete. (Student Numbers start at 000000001)");
				int choice= Integer.parseInt(in.nextLine());
				boolean choiceselection=false;
				while(choiceselection==false){
				if(choice>000000000)
				{
				removeStudent(choice-000000001);
				StudentNumber = choice; 
				choiceselection= true;
				}
				else
				{
				}
				}
				// gets the student the user wants to remove
				}
					
			else if (menu == 5){
				
				// the user types a student number and is presented with the associated record.
				
				System.out.println("Which student do you want to search for? (Student numbers start at 000000001)");
				int studentNumber = in.nextInt();
				in.nextLine();
				searchStudent(studRecs.get(studentNumber));
			
			}	
				
			else if (menu == 6)
				
				sortStudent();
			
			else if (menu == 7)
				
				saveRecords();
			
			else if (menu == 8)
				
				loadRecords();
				
		}while(menu != 10);
				 
			System.exit(0);
	
	}catch (Exception e){
		
		e.printStackTrace();
		System.out.println("Error");
		
	} 
	}
		
		public static void studentRecord(){
			 
			// The user types in what information they want to get stored with each given variable which comprises the student record.
			
			Student student = new Student();
			student.getStudentNumber();
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
			
			// Prints out all the information stored in a student record.
			
			System.out.println(student.getStudentNumber());
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
			
			// Prints out every single student record stored in the array list.
			
			for(int i=0; i<studRecs.size(); i++){
				
				// goes through the entire list of students created
				int j=i+1;
				System.out.println("student: "+j);
				PrintStudent(studRecs.get(i));
				// calls the printInfo method to print the information of the i student
				System.out.println("");
				
			}
		}
		
		public static void removeStudent(int a){
			
			studRecs.remove(a);
			
		}

		public static void searchStudent(Student student){
			
			// // Prints out all the information stored in a student record.
			
			System.out.println(student.getStudentNumber());
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
		 
		public static void saveRecords(){
			
			String filename= "Students.txt";
			FileOutputStream fileOutputStream;
			try {
			fileOutputStream = new FileOutputStream(filename);
			PrintStream fps= new PrintStream(fileOutputStream);
			for( int i= 0; i<studRecs.size();i++)
			{
			fps.println(studRecs.get(i).toString());
			}
			// saves and prints the student records
			fileOutputStream.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			}
		
		public static void loadRecords(){
			
			String filename= "Students.txt";
			BufferedReader fbr;
			try {
			fbr = new BufferedReader (new FileReader(filename));

			String s []= fbr.readLine().split(",");
			Student student1= new Student(s[0], s[1],s[2],Long.parseLong( s[3]), s[4], province(s[5]), s[6] ,Long.parseLong(s[7]), s[8]);
			studRecs.add(student1);
			// loads all the students that have been entered.
			} catch (InvalidInputException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			catch(NullPointerException e){
			System.out.println("Nothing in this file")
				
			}
		}

		public static Province ProvinceTerritories(){
			
			case ON:
			case "Ontario"
			return ProvinceTerritories().Ontario
		}
		
} 



		
		

		
		
		
		 
		


			


