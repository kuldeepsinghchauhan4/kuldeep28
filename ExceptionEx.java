import java.lang.Exception.*;
public class ExceptionEx {
public static void main(String args[]) {
	 int n1=1,n2=0;
	try {
		
		
		float r=n1/n2;
		//System.out.println("null excepton:"+s);
		}catch(ArithmeticException e){
			System.out.println("error is resolved:"+e.getMessage());	
		}
	
	/*catch(ArrayIndexOutOfBoundsException e){
		System.out.println("error is resolved:"+e.getMessage());	
	}*/
	finally {
		System.out.println("finally block is executed");
	
	}


	System.out.println("error is resolved2:");	
}

}


