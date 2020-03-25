package interfaces;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public LibraryInterfaceDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers[] k=new KidUsers[10];
		AdultUser a=new AdultUser();
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			//kid			
			k[0].age=sc.nextInt();
			k[0].registerAccount();
			k[1].age=sc.nextInt();			
			k[1].registerAccount();
			
			k[0].bookType=sc.nextLine();
			k[0].requestBook();
			k[1].bookType=sc.nextLine();
			k[1].requestBook();
			break;
		case 2:
			//adult
			a.age=sc.nextInt();
			a.bookType=sc.nextLine();
			a.registerAccount();
			a.requestBook();
			break;
		default:
			System.out.println("Something went wrong");
		}
		
		sc.close();
		
	}

}
