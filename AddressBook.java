/**
 * @author Sandeep_Singh
 * @Functionality Add New Contact 
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

class Person {
	String fname;
	String lname;
	String phonenumber;
	String City;
	String zipcode;
	String Email;

	Person(String fname, String lname, String phoneNumber, String city, String zipCode, String email) {
		this.fname = fname;
		this.lname = lname;
		this.phonenumber = phoneNumber;
		this.City = city;
		this.zipcode = zipCode;
		this.Email = email;
	}
}

public class AddressBook {
	public static ArrayList<Person> contacts = new ArrayList<Person>();

	private static void addContact() {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the firstName:");
		String firstName = inp.nextLine();
		System.out.println("Enter the LastName:");
		String lastName = inp.nextLine();
		System.out.println("Enter the phone:");
		String phoneNum = inp.nextLine();
		System.out.println("\nAddress:");
		System.out.println("Enter the city:");
		String city = inp.nextLine();
		System.out.println("Enter the state:");
		String state = inp.nextLine();
		System.out.println("Enter the zipcode:");
		String zipCode = inp.nextLine();
		System.out.println("Enter the email-id:");
		String email = inp.nextLine();
		contacts.add(new Person(firstName, lastName, phoneNum, city, state, zipCode));
	}

	public static void main(String[] args) {
		addContact();
	}
}
