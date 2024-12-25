package Day11;

public class Q4cw {
 private String name;
 private int age;
 private String country;
 
 public String getName() {
	 return this.name;
 }
 public void setName(String name) {
	 this.name=name;
 }
 public int getAge() {
	 return this.age;
 }
 public void setAge(int age) {
	 this.age=age;
 }
 public String getCountry() {
	 return this.country;
 }
 public void setCountry(String country) {
	 this.country=country;
 }
 
 
 public void print() {
	 System.out.println(this.name);
	 System.out.println(this.age);
	 System.out.println(this.country);
 }
 public static void main(String[] args) {
	 Q4cw obj=new Q4cw();
	 obj.setName("vishal");
	 obj.setAge(20);
	 obj.setCountry("india");
	 obj.print();
 }
}
