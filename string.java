import java.util.Scanner;
public class string {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur string");
				String s=sc.next();
				System.out.println(" ur string:"+s);
				int l=s.length();
				System.out.println("length of string:"+l);
				/* int UserIn;
				 UserIn=sc.nextInt();
				 int cond=UserIn;*/
				//System.out.println("ur cond:"+cond);
				//while(l!='\0') {
				char[] stringArray= s.toCharArray();
				//for(char output:stringArray) {
				//System.out.println(" string as chararray:"+output);
		
/*switch(cond) {
 case 1:
          */  for(int i=0;i<l;i++) {
        	  if(i%2!=0) {
        		 stringArray[i]='#';
     				System.out.print(stringArray[i]);
        	  }
     		   else
     			  System.out.print(stringArray[i]);
     					
          }
        	  
// case 2:             
          char[] newArray=new char[20];
				int i;
				for( i=0;i<l;i++) {
					for(int j=0;j<l;j++) {
					if(stringArray[i]==stringArray[j]) {
						newArray[i]=stringArray[i];
						stringArray[i]='\0';
					}
					else {
						System.out.println(stringArray);
					}
					}
					
				
				//int i;
				System.out.println(stringArray[i]);
        	  }
          }

}

