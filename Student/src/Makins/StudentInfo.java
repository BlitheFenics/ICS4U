package Makins;

import java.util.Scanner;

public class StudentInfo extends Student {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		Student student1 = new Student();
		System.out.println("Enter Your First Name.");
		student1.setFirstName(in.nextLine());
		System.out.println("Enter Your Last Name.");
		student1.setLastName(in.nextLine());
		System.out.println("Enter Your Street Address.");
		student1.setStreetAddress(in.nextLine());
		System.out.println("Enter Your City.");
		student1.setCity(in.nextLine());
		System.out.println("Enter Your Province.");
		student1.setProvince(in.nextLine());
		System.out.println("Enter Your Postal Code.");
		student1.setPostalCode(in.nextLine());
		System.out.println("Enter Your Phone Number.");
		student1.setPhoneNumber(in.nextLine());
		System.out.println("Enter Your Birthdate.");
		student1.setBirthDate(in.nextLine());
		
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getStreetAddress());
		System.out.println(student1.getCity());
		System.out.println(student1.getProvince());
		System.out.println(student1.getPostalCode());
		System.out.println(student1.getPhoneNumber());
		System.out.println(student1.getBirthDate());
		
		}

}
