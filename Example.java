
public class Example implements Sam {
	//int x;
 public  void show() {
	// this.x=x;
	System.out.println("this is a example of interface");
}
 public static void main(String args[]) {
	 Example e=new Example();
	 e.show();
	 System.out.println("this is a example of interface:"+e.rollno);
 }
}
