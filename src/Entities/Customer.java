package Entities;
import Abstract.IEntitiy;

public class Customer implements IEntitiy {
	public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}
	public int Id;
	public String FirstName;
	public String LastName;
	public int DateOfBirth;
	public String NationalityId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
}
