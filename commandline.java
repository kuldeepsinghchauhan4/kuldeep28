
public class commandline {
	public static void main(String args[]) {
		System.out.println("your first argument is:"+args[0]);
		int no=Integer.parseInt(args[0]);
		if(no>0) {
			System.out.println("positive");
			
		}
		else {
			System.out.println("negative");
		}
	}

}
