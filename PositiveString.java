import java.util.Scanner;

public class PositiveString {
        public void Positive(String s)
        {int i,f=0;
        for(i=0;i<s.length()-1;i++)
        {if((s.charAt(i)-'a')>(s.charAt(i+1)-'a'))
        	{f=1;break;}
        }
        if(f==0)
        	System.out.println("Positive");
        else
        	System.out.println("Negative");
        }
        public static void main(String args[])
        {
             Scanner o=new Scanner(System.in);
             String s=o.nextLine();
             PositiveString p=new PositiveString();
             p.Positive(s);
        }
}