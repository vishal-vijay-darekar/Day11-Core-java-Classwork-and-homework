package Day11;

public class Q3hw {
 private int lenght;
 private int width;
 
 public int getLenght() {
	 return this.lenght;
 }
 public void setLenght(int lenght) {
	 this.lenght=lenght;
 }
 public int getWidth() {
	 return this.width;
 }
 public void setWidth(int width) {
	 this.width=width;
 }
 
 
 
 public void print() {
	 System.out.println(this.lenght*this.width);
//	 System.out.println(this.width);
	 
 }
 public static void main(String[] args) {
	 Q3hw obj=new Q3hw();
	 obj.setLenght(22);
	 obj.setWidth(43);
	 obj.print();
 }
}
