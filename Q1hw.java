package Day11;

public class Q1hw {
 private int a;
 private int b;
 public Q1hw(int a,int b) {
	 this.a=a;
	 this.b=b;
 }
 public void Take()
 {
	 int total=a+b;
	 System.out.println(total);
 }
 public static void main(String[] args) {
	 Q1hw hw=new Q1hw(2,4);
	 hw.Take();
	 
 }
}
