package Makins;

public class Student implements Comparable{
	
	// Creates the ID Generator, the student number, and creates all the variables used in the student record.
	
	public static long idGenerator = 000000000;
	static long StudentNumber;		
	
	public Student(String firstName, String lastName, String streetAddress, String city, String province, String postalCode, String phoneNumber, String birthDate){
		setFirstName(firstName);
		setLastName(lastName);
		setStreetAddress(streetAddress);
		setCity(city);
		setProvince(province);
		setPostalCode(postalCode);
		setPhoneNumber(phoneNumber);
		setBirthDate(birthDate);
		
	}
	
	public Student(){
		setFirstName("");
		setLastName("");
		setStreetAddress("");
		setCity("");
		setProvince("");
		setPostalCode("");
		setPhoneNumber("");
		setBirthDate("");
		this.setStudentNumber(idGenerator);
		idGenerator++;
	
	}

	private String FirstName;
	private String LastName;
	private String StreetAddress;
	private String City;
	private String Province;
	private String PostalCode;
	private String PhoneNumber;
	private String BirthDate;
	
	public void setFirstName (String Fname){
		this.FirstName = Fname;
	}
	
	public void setLastName (String Lname){
		this.LastName = Lname;
	}
	
	public void setStreetAddress (String Saddress){
		this.StreetAddress = Saddress;
	}
	
	public void setCity (String strCity){
		this.City = strCity;
	}
	
	public void setProvince (String Prov){
		this.Province = Prov;
	}
	
	public void setPostalCode (String Pcode){
		this.PostalCode = Pcode;
	}
	
	public void setPhoneNumber (String Pnumber){
		this.PhoneNumber = Pnumber;
	}
	
	public void setBirthDate (String Bdate){
		this.BirthDate = Bdate;
	}
	
	public void setStudentNumber(long studentNumber) {
		StudentNumber = studentNumber;
	}
	
	public String getFirstName(){
		return this.FirstName;
	}
	
	public String getLastName(){
		return this.LastName;
	}
	
	public String getStreetAddress(){
		return this.StreetAddress;
	}
	
	public String getCity(){
		return this.City;
	}
	
	public String getProvince(){
		return this.Province;
	}
	
	public String getPostalCode(){
		return this.PostalCode;
	}
	
	public String getPhoneNumber(){
		return this.PhoneNumber;
	}
	
	public String getBirthDate(){
		return this.BirthDate;
	}		
	
	public long getStudentNumber() {
		return StudentNumber;
	}
	
	public String toString(){
		return FirstName +","+ LastName +"," + StreetAddress + "," + City +","+ Province + "," + PostalCode + "," + PhoneNumber + "," + BirthDate + "," + StudentNumber;
	}

	@Override
	public int compareTo(Object O) {
		
		return 0;
	}

	public void remove() {
		
	}

 }

 