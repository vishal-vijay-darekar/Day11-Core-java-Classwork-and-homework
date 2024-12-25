package Day11;

public class Q2cw {
  private int marathi;
  private int hindi;
  public Q2cw(int marathi, int hindi) {
	  this.marathi=marathi;
	  this.hindi=hindi;
  }
  public void average() {
	  int avarage=(marathi+hindi)/2;
	  System.out.println("Avarage is: "+avarage);
	  
  }
  public static void main(String[] args) {
	  Q2cw obj=new Q2cw(20,20);
	  obj.average();
  }
}
