package com.cg.hsm.client;
import java.util.Date;
import java.util.Scanner;
import com.cg.hsm.entity.RoleEntity;
public class UserLogin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ch = "Y";

		while (ch.equalsIgnoreCase("Y")) {
			System.out.println("Enter your Choice:");
			System.out.println("1.Sign in");
			System.out.println("2.Sign Up");
			System.out.println("3.Exit");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id, Name and Description"); // login
				RoleEntity re = new RoleEntity();
				re.setId(s.nextLong()); // Enter id
				re.setName(s.next()); // Enter name
				re.setDescription(s.next()); // Enter description
				break;
			case 2:
				System.out.println("Enter Id:");
				long id = s.nextLong();
				System.out.println("Enter firstName:");
				String firstName = s.next();
				System.out.println("Enter lastName:");
				String lastName = s.next();
				System.out.println("Enter login:");
				String login = s.next();
				System.out.println("Enter Password:");
				String password = s.next();
				System.out.println("Enter Confirm Password:");
				String Confirmpassword = s.next();
				System.out.println("Enter Date Of Birth:");
				// Date dob =
				System.out.println("Enter Mobile Number: ");
				String mobileNo = s.next();
				System.out.println("Enter role Id: ");
				long roleId = s.nextLong();
				System.out.println("Enter Gender: ");
				String gender = s.next();
				System.out.println("Enter the image: ");
				String image = s.next();
				break;
			case 3:
				System.out.println("Thank You for Visiting this application");
				break;
			default:
				System.out.println("Wrong Choice");
			}
			System.out.println("Do you want to continue?");
			ch = s.next();
		}
	}
}