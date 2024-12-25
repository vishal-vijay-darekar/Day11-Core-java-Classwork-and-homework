package Day11;

public class Q4hw {
 private int radius;
 
 public int getRadius() {
	 return this.radius;
 }
 public void setRadius(int radius) {
	 this.radius=radius;
 }
 
 public void print(int radius) {
	 System.out.println("Area of circle is : "+2*radius*3.14);
 }
 public static void main(String[] args) {
	 Q4hw obj=new Q4hw();
	 obj.setRadius(12);
	 obj.print(0);
 }
}
