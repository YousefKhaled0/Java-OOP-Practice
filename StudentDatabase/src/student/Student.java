package student;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private Integer balance;
	private boolean enrolled[];
	private static int ID = 1000;

	public Student() {
		enrolled = new boolean[5];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName = scanner.nextLine();
		System.out.print("Enter Student Last Name: ");
		this.lastName = scanner.nextLine();
		boolean correctYear = false;
		do {
			System.out.print("Please Enter a valid Student Year [1 , 2 , 3 , 4]: ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				this.gradeYear = "First";
				this.studentID = 1 + "" + ID++;
				correctYear = true;
			} else if (choice == 2) {
				this.gradeYear = "Second";
				this.studentID = 2 + "" + ID++;
				correctYear = true;
			} else if (choice == 3) {
				this.gradeYear = "third";
				this.studentID = 3 + "" + ID++;
				correctYear = true;
			} else if (choice == 4) {
				this.gradeYear = "Fourth";
				this.studentID = 4 + "" + ID++;
				correctYear = true;
			}
		} while (!correctYear);

		System.out.println("New student " + firstName + " " + lastName + " student ID is " + studentID + " is in "
				+ gradeYear + " year.");
		int totalMoney = this.enroll();
		System.out.println("Total enrollment money is " + totalMoney);
		this.balance = totalMoney;
	}

	private int enroll() {
		System.out.println();
		System.out.println("Enter Course to enroll any key to quit!");
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int totalMoney = 0;
		do {
			System.out.println();
			System.out.println("Available Courses:");
			System.out.println("1." + Course.History101);
			System.out.println("2." + Course.Mathematics101);
			System.out.println("3." + Course.English101);
			System.out.println("4." + Course.Chemistry101);
			System.out.println("5." + Course.ComputerScience101);
			choice = scanner.nextInt();
			if (choice == 1)
				totalMoney += this.enroll(Course.History101);
			else if (choice == 2)
				totalMoney += this.enroll(Course.Mathematics101);
			else if (choice == 3)
				totalMoney += this.enroll(Course.English101);
			else if (choice == 4)
				totalMoney += this.enroll(Course.Chemistry101);
			else if (choice == 5)
				totalMoney += this.enroll(Course.ComputerScience101);
		} while ((choice == 1 || choice == 2 || choice == 3 || choice == 4));

		return totalMoney;
	}

	private int enroll(Course c) {
		if (this.enrolled[c.ordinal()]) {
			System.out.println("Already enrolled in " + c);
			System.out.println();
			return 0;
		}
		this.enrolled[c.ordinal()] = true;
		return 600;
	}

	public void viewBalance() {
		System.out.println();
		System.out.println("**************");
		System.out.println("Your balance is " + this.balance);
		System.out.println("**************");
		System.out.println();
	}

	public void payTuition() {
		System.out.println();
		System.out.println("**************new payment*************");
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		this.viewBalance();
		System.out.print("Enter Amount to Pay: ");
		int payment = scanner.nextInt();
		if (payment <= balance)
			balance -= payment;
		else {
			System.out.println("Can't payment greater than balance");
			return;
		}
		System.out.println("Thank you for your payment");
		this.viewBalance();
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder("Student [firstName=" + firstName + ", lastName=" + lastName
				+ ", gradeYear=" + gradeYear + ", studentID=" + studentID + ", balance=" + balance + "]\n");
		s.append("Enrolled courses [ ");
		if (enrolled[0])
			s.append(Course.History101 + " ");
		if (enrolled[1])
			s.append(Course.Mathematics101 + " ");
		if (enrolled[2])
			s.append(Course.English101 + " ");
		if (enrolled[3])
			s.append(Course.Chemistry101 + " ");
		if (enrolled[4])
			s.append(Course.ComputerScience101 + " ");
		s.append("]");
		return s.toString();
	}

}
