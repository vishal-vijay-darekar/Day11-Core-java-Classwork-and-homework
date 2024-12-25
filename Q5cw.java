package Day11;

public class Q5cw {
  private int lenght=5;
  private int width=6;
  public Q5cw(int lenght,int width) {
	  this.lenght=lenght;
	  this.width=width;
  }
  public void  rectangle() {
	  int rectangle=lenght*width;
	  System.out.println(rectangle);
  }
  public static void main(String[] args) {
	  Q5cw cw=new Q5cw(3,5);
	  cw.rectangle();
  }
	  
  
}
