package ATM;

public class ATM {
	
	private double balanceAmount;
	private double widthdrawAmount;
	private double depositAmount;
	
	ATM(){
		
	}
	
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public double getWidthdrawAmount() {
		return widthdrawAmount;
	}
	public void setWidthdrawAmount(double widthdrawAmount) {
		this.widthdrawAmount = widthdrawAmount;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	@Override
	public String toString() {
		return "ATM [balanceAmount=" + balanceAmount + ", widthdrawAmount=" + widthdrawAmount + ", depositAmount="
				+ depositAmount + "]";
	}
	
}
