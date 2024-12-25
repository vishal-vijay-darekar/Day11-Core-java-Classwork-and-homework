package Day11;

import java.lang.classfile.AnnotationValue.OfString;

public class Q3cw {
 String language;
 String language2;
 String language3;
  public Q3cw(String language,String language2,String language3) {
	  this.language=language;
	  this.language2=language2;
	  this.language3=language3;
  }
  public void Name() {
	 System.out.println("Programming languages is : "+language);
	 System.out.println("Programming languages is : "+language2);
	 System.out.println("Programming languages is : "+language3);
  }
  public static void main(String[] args) {
	  Q3cw obj=new Q3cw("java");
	  Q3cw java=new Q3cw("java");
	  obj.Name();
  }
}
