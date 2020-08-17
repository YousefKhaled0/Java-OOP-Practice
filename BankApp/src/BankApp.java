import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankApp {
	
	public static void main (String [] args) {
		
		List<Account> accounts = new ArrayList<Account>();
		
		try {
			BufferedReader csvReader = new BufferedReader(new FileReader("/home/yousef/Downloads/NewBankAccounts.csv"));
			String row = csvReader.readLine();
			while (row != null) {
				//System.out.println(row);
				String [] info = row.split(",");
				if (info[2].equals("Savings")) {
					accounts.add(new SavingsAccount(info[0] , info[1] , AccountType.Savings , new Integer(info[3])));
				}else if (info[2].equals("Checking")) {
					accounts.add(new CheakingAccount(info[0] , info[1] , AccountType.Savings , new Integer(info[3])));
				}
				row = csvReader.readLine();
			}
			for (Account account : accounts) {
				System.out.println(account);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
