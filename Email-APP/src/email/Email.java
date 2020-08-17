package email;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private Integer mailBoxCapacity;
	private String altEmail;
	private Department department;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randPassword(10);
		StringBuilder email = new StringBuilder();
		email.append(firstName.toLowerCase() + ".");
		email.append(lastName.toLowerCase() + "@");
		if (department != null)
			email.append(department + ".");
		email.append("company.com");
		// System.out.println(email);
		System.out.println();
		System.out.println("Your Email is: " + email.toString());
		System.out.println("Your password is: " + password.toString());
		this.mailBoxCapacity = 500;
	}

	// ---------------------------------------------------------------------------------

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public void setMailBoxCapacity(Integer mailBoxCapacity) {
		this.mailBoxCapacity = mailBoxCapacity;
	}

	public String getAltEmail() {
		return altEmail;
	}

	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Email [firstName=" + firstName + ",\nlastName=" + lastName + ",\npassword=" + password
				+ ",\nmailBoxCapacity=" + mailBoxCapacity + ",\naltEmail=" + altEmail + ",\ndepartment=" + department
				+ "]";
	}

	// ---------------------------------------------------------------------
	private String randPassword(int len) {

		String seed = "QW@$!@#ERTYUIOPASDFGHJKLZXCVBNM1234567890@!$%";

		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < len; i++) {
			stringBuilder.append(seed.charAt((int) (Math.random() * (seed.length() - 1))));
		}

		return stringBuilder.toString();
	}

	private Department setDepartment() {
		System.out.println("Departments:");
		System.out.println("1.sales");
		System.out.println("2.development");
		System.out.println("3.accounting");
		System.out.println("4.else");
		System.out.print("Enter Department: ");
		Scanner scanner = new Scanner(System.in);
		switch (scanner.nextInt()) {
		case 1:
			scanner.close();
			return Department.sales;
		case 2:
			scanner.close();
			return Department.development;
		case 3:
			scanner.close();
			return Department.accounting;
		default:
			scanner.close();
			return null;
		}
	}

	private static enum Department {
		sales, development, accounting
	};
}
