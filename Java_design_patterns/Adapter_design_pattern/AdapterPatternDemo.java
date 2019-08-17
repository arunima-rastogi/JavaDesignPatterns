package Adapter_design_pattern;

/**Create a AdapterPatternDemo class (client class).
 * 
 *
 */
public class AdapterPatternDemo {
	public static void main(String args[]) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}
}