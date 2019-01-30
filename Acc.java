
class Acc extends Curr{
 int  accNum;
double balance;


public long getAccNum() {
	return accNum;
}
public void setAccNum(int accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

void deposit(double balance) {
	//this.balance=balance;
	this.balance+=balance;
	System.out.println("ur current balance after deposit is:"+this.balance);
}
void withdraw(double balance) {
	//this.balance=balance;
	this.balance-=balance;
	System.out.println("ur current balance after withdraw is:"+balance);
}
void getBalance(double balance) {
	
}
public static void main(String args[]) {
	Curr c=new Curr();
	c.withdraw();
	
	
}





}