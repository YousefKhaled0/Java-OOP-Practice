
public class SavingsAccount extends Account {

	private String saftyDepositeBoxID;
	private String saftyDepositeBoxKey;

	public SavingsAccount(String name, String SSN, AccountType accountType, Integer balance) {
		super(name, SSN, accountType, balance);
		saftyDepositeBoxID = "" + (int) (Math.random() * 1000);
		saftyDepositeBoxKey = "" + (int) (Math.random() * 10000);
	}

	@Override
	public double rate() {
		return 2.5 - (.25 * 2.5);
	}

	public String getSaftyDepositeBoxID() {
		return saftyDepositeBoxID;
	}

	public void setSaftyDepositeBoxID(String saftyDepositeBoxID) {
		this.saftyDepositeBoxID = saftyDepositeBoxID;
	}

	public String getSaftyDepositeBoxKey() {
		return saftyDepositeBoxKey;
	}

	public void setSaftyDepositeBoxKey(String saftyDepositeBoxKey) {
		this.saftyDepositeBoxKey = saftyDepositeBoxKey;
	}

	@Override
	public String toString() {
		return "SavingsAccount [saftyDepositeBoxID=" + saftyDepositeBoxID + ", saftyDepositeBoxKey="
				+ saftyDepositeBoxKey + ", owner=" + owner + ", SSN=" + SSN + ", accountType=" + accountType
				+ ", balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}

}
