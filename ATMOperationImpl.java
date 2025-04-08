package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ATMOperationImpl implements ATMInterface {

	ATM atm = new ATM();
	Map<Double, String> ministmt=new HashMap<>();
	@Override
	public void viewBalance() {
		System.out.println("Available balance is :"+atm.getBalanceAmount());
	}

	@Override
	public void withdrawAmount(double widthdrawAmount) {
		if(widthdrawAmount%200==0 ||widthdrawAmount%500==0)
		{
			if(widthdrawAmount<=atm.getBalanceAmount()) {
				System.out.println("Collect your cash "+widthdrawAmount);
				atm.setBalanceAmount(atm.getBalanceAmount()-widthdrawAmount);
				ministmt.put(widthdrawAmount, "Amount widthdrawn");
				viewBalance();
			}
			else {
				System.out.println("Insufficient balance");
			}
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("Enter deposit amount :"+ depositAmount);
		atm.setBalanceAmount(atm.getBalanceAmount()+depositAmount);
		ministmt.put(depositAmount, "Amount deposited succesfully..");
		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		Set<Double> set= ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+" = "+ministmt.get(d));
			
		}
	}

}
