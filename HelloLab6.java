import java.util.Random;

class Helloo{
	public static void main(String args[]) {
		//int accNo;
		Random r=new Random();
		 int a1=r.nextInt(10000);
		 int a2=r.nextInt(1000);
		Person s=new Person("smith",20);
		Person k=new Person("kathy",21);
		Account a3=new Account(a1,s,2000);
		Account a4=new Account(a2,s,3000);
		
		
	
		s.deposit(2000.0);
		s.withdraw(2000.0);
		
		/*k.setBalance(3000);
		k.setName("kathy");*/
	 
		
	
	}
}

