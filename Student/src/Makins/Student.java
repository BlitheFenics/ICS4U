package Makins;

public class Student {

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
		
}
