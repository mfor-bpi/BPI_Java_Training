package ph.com.bpi.m4.act4;

public class AccountValidator {

	public static void main(String[] Args) {
		
		try {
			validateAccountNumber("1234567890");
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			validateAccountNumber("123");
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			validateAccountNumber(null);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
	
	public static void validateAccountNumber(String accountNumber) throws Exception{
		
		if (accountNumber == null) {
			throw new NullPointerException("Cannot be null");	
		} else if (accountNumber.length() != 10) {
			throw new Exception("Must be 10 digits");
		} else {
			System.out.println("Valid account: " + accountNumber);
		}

	}

}
