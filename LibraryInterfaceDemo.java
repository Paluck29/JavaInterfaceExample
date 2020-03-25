package interfaces;

import java.util.Scanner;

public class LibraryInterfaceDemo {

	public LibraryInterfaceDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers[] k=new KidUsers[2];
		AdultUser a=new AdultUser();
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			//kid
			k[0]=getInput(sc);
			k[1]=getInput(sc);
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
//For array of objects , you need to have input like that
	private static KidUsers getInput(Scanner sc) {
		KidUsers k=new KidUsers();
		k.age=sc.nextInt();
		k.registerAccount();
		sc.nextLine();
		k.bookType=sc.nextLine();
		k.requestBook();
		return k;
	}

}
