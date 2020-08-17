
public class CheakingAccount extends Account {

	private String depitCardNumber;
	private String PIN;

	public CheakingAccount(String name, String SSN, AccountType accountType, Integer balance) {
		super(name, SSN, accountType, balance);
		PIN = "" + (int) (Math.random() * 10000);
		depitCardNumber = "" + (long) (Math.random() * Math.pow(10, 12));
	}

	@Override
	public double rate() {
		return 2.25 + (.15 * 2.5);
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public String getDepitCardNumber() {
		return depitCardNumber;
	}

	public void setDepitCardNumber(String depitCardNumber) {
		this.depitCardNumber = depitCardNumber;
	}
	
	@Override
	public String toString() {
		return "CheakingAccount [depitCardNumber=" + depitCardNumber + ", PIN=" + PIN + ", owner=" + owner + ", SSN="
				+ SSN + ", accountType=" + accountType + ", balance=" + balance + ", accountNumber=" + accountNumber
				+ "]";
	}

}
