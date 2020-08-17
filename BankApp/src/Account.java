
public abstract class Account implements IRate {

	protected String owner;
	protected String SSN;
	protected AccountType accountType;
	protected Integer balance;
	protected String accountNumber;
	private static Integer ID = 10000;

	public Account() {

	}

	public Account(String owner, String sSN, AccountType accountType, Integer balance) {
		this.owner = owner;
		SSN = sSN;
		this.accountType = accountType;
		this.balance = balance;
		this.accountNumber = this.generateAccountNumber();
	}

	private String generateAccountNumber() {
		StringBuilder number = new StringBuilder();
		if (accountType.equals(AccountType.Cheaking)) {
			number.append("2");
		} else {
			number.append("1");
		}
		number.append(SSN.charAt(SSN.length() - 2));
		number.append(SSN.charAt(SSN.length() - 1));
		number.append("" + ID++);
		number.append("" + (int) (Math.random() * 1000));

		return number.toString();
	}

	public void deposite(int a) {
		System.out.println();
		if (a <= 0)
			System.out.println("Please use correct value for deposite");
		else {
			System.out.println("Balance before " + balance);
			balance += a;
			System.out.println("Balance after " + balance);
		}
		System.out.println();
	}

	public void withdraw(int a) {
		System.out.println();
		if (a <= 0)
			System.out.println("Please use correct value for withdraw");
		else if (a > balance)
			System.out.println("More Than account balance not allowed");
		else {

			System.out.println("Balance before " + balance);
			balance -= a;
			System.out.println("Balance after " + balance);
		}
		System.out.println();
	}

	public void transfer(String to, int a) {
		System.out.println();
		if (a <= 0)
			System.out.println("Please use correct value for transfer");
		else if (a > balance)
			System.out.println("More Than account balance not allowed");
		else {

			System.out.println("Balance before " + balance);
			balance -= a;
			System.out.println("Balance after " + balance);
			System.out.println("transfer to " + to);
		}
		System.out.println();
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", SSN=" + SSN + ", accountType=" + accountType + ", balance=" + balance
				+ ", accountNumber=" + accountNumber + "]";
	}

}
