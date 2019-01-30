import java.util.Scanner;
public class StringDemo {
public static void main(String args[]) {
	int f=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ur string");
	String s=sc.next();
	System.out.println("ur string is:"+s);
	char[] stringArray=s.toCharArray();
	int d=s.length();
	for(int i=0 ; i<d-1 ; i++)
	{
		
			if((stringArray[i])>(stringArray[i+1]))
				{f=1;break;
			}
		
	}
	
	if(f==1)
		System.out.println("-ve");
	else
		System.out.println("+ve");
	
}
}
