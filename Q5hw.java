package Day11;

public class Q5hw {
 private String company;
 private String model;
 private int year;
 private int milage;
 
 public String getCompany() {
	 return this.company;
 }
 public void setCompany(String company) {
	 this.company=company;
 }
 
 
 public String getModel() {
	 return this.model;
 }
 public void setModel(String model) {
	 this.model=model;
 }
 
 
 public int getYear() {
	 return this.year;
 }
 public void setYear(int year) {
	 this.year=year;
 }
 
 
 public int getMilage() {
	 return this.milage;
 }
 public void setMilage(int milage) {
	 this.milage=year;
 }
 
 public void print(String company, String model,int year,int milage) {
	 System.out.println("Company name"+this.company);
	 System.out.println("car Model"+this.model);
	 System.out.println("year"+this.year);
	 System.out.println("milage"+this.milage);
	 
 }
 public static void main(String[] args) {
	 Q5hw obj=new Q5hw();
	 obj.setCompany("hundai");
	 obj.setModel("xyz");
	 obj.setYear(2004);
	 obj.setMilage(45);
	 obj.print(null, null, 0, 0);
	 
 }
 
}
