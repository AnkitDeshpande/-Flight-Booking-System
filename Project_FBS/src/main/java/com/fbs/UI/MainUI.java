package com.fbs.UI;

import java.util.Scanner;

import com.fbs.Enums.AdminCredentials;

public class MainUI {
	
	static void adminLogin(Scanner sc) {

		System.out.print("Enter admin username: ");
		String username = sc.next();

		System.out.print("Enter admin password: ");
	
		String password = sc.next();

		if (username.equals(AdminCredentials.USERNAME.getValue())
				&& password.equals(AdminCredentials.PASSWORD.getValue())) {
			System.out.println("Admin login successfull !");
			System.out.println("Welcome Ankit !");
			System.out.println("-----------------------------------------------------------------------------");
			MainUI.adminMenu(sc);
		} else {
			System.out.println("Invalid username or password.");
		}
		
	}
	
	static void adminOperations() {
		System.out.println("1. Add a company");
		System.out.println("2. Update Company.");
		System.out.println("3. Delete Company");
		System.out.println("4. View All company ");
		System.out.println("5. Add a Flight");
		System.out.println("6. Update a Flight ");
		System.out.println("7. Delete a Flight ");
		System.out.println("8. View All Flights");
		System.out.println("9. Get all Users ");
		System.out.println("0. Logout");
	}
	
	static void adminMenu(Scanner sc) {
		int choice = 0;
		do {
			adminOperations();
			System.out.print("Enter selection ");
			choice = sc.nextInt();
    		switch(choice) {
    			case 1:
    				AdminUI.addCompany(sc);
    				break;
    			case 2:
    				AdminUI.updateCompany(sc);
    				break;
    			case 3:
    				AdminUI.deletecompany(sc);
    				break;
    			case 4:
    				AdminUI.viewAllCompanies(sc);
    				break;
    			case 5:
    				AdminUI.addFlight();
    	            break;
    	        case 6:
    	        	AdminUI.updateFlight();
    	            break;
    	        case 7:
    	        	AdminUI.deleteFlight();
    	            break;
    	        case 8:
    	        	AdminUI.viewAllFlights();
    	            break;
    	        case 9:
    	        	AdminUI.getAllUsers();
    	            break;
    			case 0:
    				System.out.println("Bye Bye Admin");
    				break;
    			default:
    				System.out.println("Invalid Selection, try again");
    		}
    	}while(choice != 0);	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please select an option:");
		System.out.println("1. Admin login");
		System.out.println("2. User login");
		System.out.println("3. Not a user? Signup");
		System.out.println("4. Exit");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Admin login selected.");
				adminLogin(sc);
			break;
		case 2:
			System.out.println("User login selected.");
			UserUI.userLogin(sc);
			break;
		case 3:
			System.out.println("Not a user? Signup selected.");
			UserUI.userSignUp(sc);
			break;
		case 4:
			System.out.println("Bye-Bye, Have a Nice Day.");
			break;
		default:
			System.out.println("Invalid choice. Enter choice between 1-4");
		}
		
		System.out.println("-----------------------------------------------------------------------------");

		sc.close();
	}

}
