package interfaces;

public class KidUsers implements LibraryUser{

	public int age;
	public String bookType;
	public KidUsers() {
		// TODO Auto-generated constructor stub
		
	}
	

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equals("Kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

}
