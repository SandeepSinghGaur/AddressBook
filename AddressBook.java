/**
 * @author Sandeep_Singh
 * @Functionality Create Contact in Address Book. 
 *
 */
public class AddressBook {
	private String city;
	private String state;
	private String zipcode;
	private String email;

	public AddressBook(String city, String state, String zipcode, String email) {
	this.city=city;
	this.state=state;
	this.email=email;
	this.zipcode=zipcode;

	}

	public String toString() {
		return " [city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", email=" + email ;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

}
