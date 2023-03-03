package marlab;

 class customer {  // class name
private String AccountName; // instance variable with private 
private long AccountNumber;
private double Accountbalance;
private double withDrawAmount;
public String getAccountName() { // use getter to get method of private instance 
	return AccountName;
}
public void setAccountName(String AccountName) {  // use setter to set the private instance 
	this.AccountName=AccountName;
}
public long getAccountNumber(){
	return AccountNumber;
}
public void setAccountNumber(long AccountNumber) {
	this.AccountNumber=AccountNumber;
}
public double getAccountbalance() {
	return Accountbalance;
}
public void setAccountbalance(double Accountbalance) {
	this.Accountbalance=Accountbalance;
}
public double getwithDrawAmount() {
	return withDrawAmount;
}
public void setwithDrawAmount(double withDrawAmount) {
	this.withDrawAmount=withDrawAmount;
}

}
