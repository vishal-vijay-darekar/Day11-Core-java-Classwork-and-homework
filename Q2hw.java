package Day11;

public class Q2hw {
 private int accountnum;
 private int balance;
 
 
 public int getAccountnum() {
	 return this.accountnum;
 }
 public void setAccountnum(int accountnum) {
	 this.accountnum=accountnum;
 }
 public int getBalance() {
	 return this.balance;
 }
 public void setBalance(int balance) {
	 this.balance=balance;
 }
 public void Print(int accountnum,int balance) {
	 System.out.println(this.accountnum);
	 System.out.println(this.balance);
 }
 public static void main(String[] args) {
	 Q2hw hw=new Q2hw();
	 hw.setAccountnum(121212);
	 hw.setBalance(4000);
	 hw.Print(0, 0);
 }
}
