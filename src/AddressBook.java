/**
 * Address book for buddy
 */

/**
 * @author Mmedara Josiah 101053887
 * @version 1.0
 */
public class AddressBook {
	
	private String name;
	private int age;
	private String address;
	private int phonenumber;
	private String school;
	
	public AddressBook(String name, int age, String address, int phonenumber, String school) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phonenumber = phonenumber;
		this.school = school;
	}
	
	/**
	 * returns my buddy's name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * stores my buddy's name in name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * returns my buddy's age 
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * stores my buddy's age in age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * returns my buddy's address
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * stores my buddy's address in address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * returns my buddy's phone number
	 * @return
	 */
	public int getPhonenumber() {
		return phonenumber;
	}
	
	/**
	 * stores my buddy's phone number in phone number
	 * @param phonenumber
	 */
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	/**
	 * returns my buddy's school
	 * @return
	 */
	public String getSchool() {
		return school;
	}
	
	/**
	 * stores my buddy's school in school
	 * @param school
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book");
	}

}
