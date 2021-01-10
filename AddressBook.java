/**
 * @author Sandeep_Singh
 * @Functionality Edit Exiting Contact
 *
 */

import java.util.LinkedList;
import java.util.Scanner;

class Person {
	String fname;
	String lname;
	String phonenumber;
	String City;
	String state;
	String zipcode;
	String Email;

	Person(String fname, String lname, String phoneNumber, String city,String state, String zip, String email) {
		this.fname = fname;
		this.lname = lname;
		this.phonenumber = phoneNumber;
		this.City = city;
		this.zipcode = zip;
		this.Email = email;
	}

	public String getFName() {
		return fname;
	}

	public void setCity(String city2) {
		this.City=city2;
		
	}

	public void setState(String state) {
		this.state=state;
		
	}

	public void setZip(String zip) {
		
		this.zipcode=zip;
	}

	public void setPhoneNum(String phoneNum) {
		this.phonenumber=phoneNum;
		
	}

}


public class AddressBook {
    Scanner input = new Scanner(System.in);

    Person addPerson() {
        
        System.out.print("Enter First name: ");
        String fname = input.next();
        System.out.print("Enter Last name: ");
        String lname = input.next();
        System.out.print("Enter City: ");
        String city = input.next();
        System.out.print("Enter state: ");
        String state = input.next();
        System.out.print("Enter Zip: ");
        String zip = input.next();
        System.out.print("Enter phone number: ");
        String phoneNum = input.next();
        String email=input.next();
       Person p= new Person(fname,lname,phoneNum,city,state,zip,email);
	      return p;
        
    }

    LinkedList<Person> editPerson(LinkedList<Person> addressBook){
        System.out.print("Enter First Name to edit record: ");
        String fname = input.next();
        System.out.print("Enter Last Name: ");
        String lname = input.next();
        int flag2 = 0;
        for(Person p : addressBook){
            System.out.print(p.getFName()+" "+p.getFName());
            if(fname.equals(p.getFName()) && lname.equals(p.getFName())){
                System.out.println("\nEnter edit choice" +
                        "\n1. Address" +
                        "\n2. City" +
                        "\n3. State" +
                        "\n4. Zip" +
                        "\n5. Phone Number");
                int choice = input.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Enter Updated Address: ");
                        break;
                    case 2:
                        System.out.print("Enter Updated City: ");
                        String city = input.next();
                        p.setCity(city);
                        break;
                    case 3:
                        System.out.print("Enter Updated State: ");
                        String state = input.next();
                        p.setState(state);
                        break;
                    case 4:
                        System.out.print("Enter Updated Zip: ");
                        String zip = input.next();
                        p.setZip(zip);
                        break;
                    case 5:
                        System.out.print("Enter Updated Phone Number: ");
                        String phoneNum = input.next();
                        p.setPhoneNum(phoneNum);
                        break;
                    default:
                        System.out.println("Wrong Choice !!!");
                }
                flag2 = 1;
                System.out.println("Updatation Successful !!!");
            }
            if (flag2 == 0){
                System.out.println("Record dose not exist !!!");
            }
        }
        return addressBook;
    }
}
